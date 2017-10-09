
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private int duration;

    /**
     * Constructor for objects of class Movie
     */
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        duration = 0;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int x) {
        rating = x;
    }
    
    public int getDurations() {
        return duration;
    }
    
    public void setDuration(int x) {
        duration = x;
    }
    
    public void showTime() {
        int hours = duration / 60;
        int minutes = duration % 60;
        System.out.println(hours + ":" + minutes);
    }
}
