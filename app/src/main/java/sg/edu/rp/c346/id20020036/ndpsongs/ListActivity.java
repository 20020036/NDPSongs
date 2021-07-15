package sg.edu.rp.c346.id20020036.ndpsongs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    Button btnStars;
    ListView lv;
    ArrayList<Song> al;
    ArrayAdapter<Song> aa;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btnStars = findViewById(R.id.btnStars);
        lv = findViewById(R.id.lv);
        al = new ArrayList<Song>();
        aa = new ArrayAdapter<Song>(this, android.R.layout.simple_list_item_1, al);
        spinner = findViewById(R.id.spinner);

        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song data = al.get(position);
                Intent i = new Intent(ListActivity.this, EditListActivity.class);
                i.putExtra("id", data);
                startActivity(i);
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                DBHelper dbh = new DBHelper(ListActivity.this);
                switch(position)
                {
                    case 0:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2000"));
                        aa.notifyDataSetChanged();
                        break;
                    case 1:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2001"));
                        aa.notifyDataSetChanged();
                        break;
                    case 2:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2002"));
                        aa.notifyDataSetChanged();
                        break;
                    case 3:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2003"));
                        aa.notifyDataSetChanged();
                        break;
                    case 4:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2004"));
                        aa.notifyDataSetChanged();
                        break;
                    case 5:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2005"));
                        aa.notifyDataSetChanged();
                        break;
                    case 6:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2006"));
                        aa.notifyDataSetChanged();
                        break;
                    case 7:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2007"));
                        aa.notifyDataSetChanged();
                        break;
                    case 8:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2008"));
                        aa.notifyDataSetChanged();
                        break;
                    case 9:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2009"));
                        aa.notifyDataSetChanged();
                        break;
                    case 10:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2010"));
                        aa.notifyDataSetChanged();
                        break;
                    case 11:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2011"));
                        aa.notifyDataSetChanged();
                        break;
                    case 12:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2012"));
                        aa.notifyDataSetChanged();
                        break;
                    case 13:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2013"));
                        aa.notifyDataSetChanged();
                        break;
                    case 14:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2014"));
                        aa.notifyDataSetChanged();
                        break;
                    case 15:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2015"));
                        aa.notifyDataSetChanged();
                        break;
                    case 16:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2016"));
                        aa.notifyDataSetChanged();
                        break;
                    case 17:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2017"));
                        aa.notifyDataSetChanged();
                        break;
                    case 18:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2018"));
                        aa.notifyDataSetChanged();
                        break;
                    case 19:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2019"));
                        aa.notifyDataSetChanged();
                        break;
                    case 20:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2020"));
                        aa.notifyDataSetChanged();
                        break;
                    case 21:
                        al.clear();
                        al.addAll(dbh.getAllSongs("2021"));
                        aa.notifyDataSetChanged();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

       btnStars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbh = new DBHelper(ListActivity.this);

                        al.addAll(dbh.getAllSongs("⭐⭐⭐⭐⭐"));
                        aa.notifyDataSetChanged();
                        finish();
                }
        });
    }
}