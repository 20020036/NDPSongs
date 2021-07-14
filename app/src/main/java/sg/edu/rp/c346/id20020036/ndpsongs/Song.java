package sg.edu.rp.c346.id20020036.ndpsongs;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Song implements Serializable {

    private int id;
    private String title;
    private String singers;
    private int year;
    private int stars;

    public Song(int id, String title, String singers, int year, int stars)
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

    public int getYear() {
        return year;
    }

    public int getStars() {
        return stars;
    }

    @NonNull
    @Override
    public String toString() {
        if(stars == 1)
        {
            return  title + "\n" + singers + " - " + year + "\n⭐";
        }
        else if(stars == 2)
        {
            return  title + "\n" + singers + " - " + year + "\n⭐⭐";
        }
        else if(stars == 3)
        {
            return  title + "\n" + singers + " - " + year + "\n⭐⭐⭐";
        }
        else if(stars == 4)
        {
            return  title + "\n" + singers + " - " + year + "\n⭐⭐⭐⭐";
        }
        else
        {
            return title + "\n" + singers + " - " + year + "\n⭐⭐⭐⭐⭐";
        }
    }
}
