
/**
 * Write a description of class MediaLib here.
 *
 * @author Michael Zhu
 * @version 8/23/17
 */
public class MediaLib
{
    public static void main(){
        double totalCost = 0;
        int numSongs = 0;
        double totalRatings = 0;
        double avCost = 0;
        double avRating = 0;
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song();
        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
        System.out.println(song1);
        song1.setPrice(1.11);
        System.out.println(song1.getPrice());
        totalCost = totalCost + song1.getPrice();
        numSongs++;
        totalRatings = totalRatings + song1.getRating();
        Song song2 = new Song("fig", 1.29, 2);
        totalCost = totalCost + song2.getPrice();
        numSongs++;
        totalRatings = totalRatings + song2.getRating();
        Song song3 = new Song("wug", 2.33, 4);
        totalCost = totalCost + song3.getPrice();
        numSongs++;
        totalRatings = totalRatings + song3.getRating();
        Song song4 = new Song("bob", .99, 5);
        totalCost = totalCost + song4.getPrice();
        numSongs++;
        totalRatings = totalRatings + song4.getRating();
        Song song5 = new Song("asdf", 1.99, 6);
        totalCost = totalCost + song5.getPrice();
        numSongs++;
        totalRatings = totalRatings + song5.getRating();
        Song song6 = new Song("the", 1.99, 7);
        totalCost = totalCost + song6.getPrice();
        numSongs++;
        totalRatings = totalRatings + song6.getRating();
        avCost = totalCost/numSongs;
        avRating = totalRatings/numSongs;
        System.out.println(totalCost);
        System.out.println(avCost);
        System.out.println(totalRatings);
        System.out.println(avRating);
        
        MediaFile.writeString(song5.getTitle(),song5.getRating());
        MediaFile.writeString(song4.getTitle(),song4.getRating());
        MediaFile.writeString(song3.getTitle(),song3.getRating());
        MediaFile.writeString(song2.getTitle(),song2.getRating());
        MediaFile.writeString(song1.getTitle(),song1.getRating());
        MediaFile.saveAndClose();
    }
}
