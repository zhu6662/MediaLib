
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
    }
    
    public Song(String title){
        this.title = title;
    }
    
    public Song(String title, double price) {
    this.title = title;
    this.price = price;
    }
    
    public Song(String title, double price, int rating) {
    this.title = title;
    this.price = price;
    this.rating =  rating;
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
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double p) {
        price = p;
    }
    
    public void addToFav(){
        favorite = true;
    }
}
