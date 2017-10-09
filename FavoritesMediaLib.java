
public class FavoritesMediaLib
{

    public static void main(){
        String songInfo = MediaFile.readString();
        System.out.println("My Favorite Songs");
        System.out.println("-----------------------------");
        int start = 0;
        int middle = 0;
        int end = 0;
        while (true)
        {
            middle = songInfo.indexOf("|",start);
           
            end = songInfo.indexOf("|",middle+1);
            
            if(end<0 || middle <0) break;
            String title = songInfo.substring(start,middle);
            
            int rating = Integer.parseInt(songInfo.substring(middle+1,end));
            if(rating > 3) System.out.println(title + "("+rating+")");
            start = end+1;
        }

        /*
        int start = 0;
        int end = 0;
        for(int i = 0; i < 100; i++){
        end = songInfo.indexOf("|",start);
        if(end<0) break;
        System.out.println(songInfo.substring(start, end));
        start = end+1;
        }
         */

      
    }
}
