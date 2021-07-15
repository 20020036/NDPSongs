package sg.edu.rp.c346.id20020036.ndpsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class EditListActivity extends AppCompatActivity {

    TextView tvID;
    EditText etTitle, etSinger, etYear;
    RadioGroup RadioGrp;
    Button btnInsert, btnDelete, btnCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_list);

        tvID = findViewById(R.id.tvID);
        etTitle = findViewById(R.id.etTitle);
        etSinger = findViewById(R.id.etSinger);
        etYear = findViewById(R.id.etYear);
        RadioGrp = findViewById(R.id.RadioGrp);
        btnInsert = findViewById(R.id.btnInsert);
        btnDelete = findViewById(R.id.btnDelete);
        btnCancel = findViewById(R.id.btnCancel);

        Intent i = getIntent();
        String song = i.getStringExtra("id");

        tvID.setText(song);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = etTitle.getText().toString() + "\n" + etSinger.getText().toString() + " - " + etYear.getText().toString();
                DBHelper dbh = new DBHelper(EditListActivity.this);
                long inserted_id = dbh.insertSong(data);
                if(inserted_id != -1)
                {
                    Toast.makeText(EditListActivity.this, "Insert successful", Toast.LENGTH_LONG).show();
                }
                etTitle.setText("");
                etSinger.setText("");
                etYear.setText("");
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbh = new DBHelper(EditListActivity.this);
                Integer id = Integer.parseInt(song);
                dbh.deleteSong(id);
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EditListActivity.this, ListActivity.class);
                startActivity(i);
            }
        });
    }
}