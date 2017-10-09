
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;

    /**
     * Constructor for objects of class book
     */
    public Book()
    {
        // initialise instance variables
        rating = 0;
        title = "";
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
}
