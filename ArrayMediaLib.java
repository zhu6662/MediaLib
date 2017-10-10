
public class ArrayMediaLib
{
    public static void main(){
        String[] sharingFriends = {"bob","asdf","will","joe"/*,"john"*/};
        for (int i = 0; i < sharingFriends.length; i++){
            System.out.println(sharingFriends[i]);
        }
        int total = 0;
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        for(int x: daysBtwnPurchase){
            total += x;
        }
        total = total / daysBtwnPurchase.length;
        
        Song[] topTenSongs = {new Song("The Twist"),new Song("Smooth"),new Song("Mack the Knife"),new Song("How do I live"), new Song("Party Rock Anthem"),
                              new Song("I Gotta Feeling"), new Song("Macarena"), new Song("Physical"), new Song("You Light Up My Life"), new Song("Hey Jude")};   
        for (Song s: topTenSongs)
            {
                   System.out.println(s.getTitle());
               }
        }
}

