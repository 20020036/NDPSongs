package sg.edu.rp.c346.id20020036.ndpsongs;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Song implements Serializable {

    private int id;
    private String title;
    private String singers;
    private String year;
    private String stars;

    public Song(int id, String title, String singers, String year, String stars)
    {
        this.id = id;
        this.title = title;
        this.singers = singers;
        this.year = year;
        this.stars = stars;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSingers() {
        return singers;
    }

    public String getYear() { return year; }

    public String getStars() {
        return stars;
    }

    @NonNull
    @Override
    public String toString() {
        if(stars == "⭐")
        {
            return  title + "\n" + singers + " - " + year + "\n⭐";
        }
        else if(stars == "⭐⭐")
        {
            return  title + "\n" + singers + " - " + year + "\n⭐⭐";
        }
        else if(stars == "⭐⭐⭐")
        {
            return  title + "\n" + singers + " - " + year + "\n⭐⭐⭐";
        }
        else if(stars == "⭐⭐⭐⭐")
        {
            return  title + "\n" + singers + " - " + year + "\n⭐⭐⭐⭐";
        }
        else
        {
            return title + "\n" + singers + " - " + year + "\n⭐⭐⭐⭐⭐";
        }
    }
}
