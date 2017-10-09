

public class LoopingMediaLib
{
   public static void main(String[] args){
       
       /*
       for(int i = 0; i < 5; i++){
       String songInfo = MediaFile.readString();
       System.out.println(songInfo);
       }
       */
      String songInfo = MediaFile.readString();
      while(songInfo != null){
          int x = songInfo.indexOf("|");
          System.out.println("Title: [" + songInfo.substring(0,x) + "]");
          System.out.println("Rating: [" + songInfo.substring(x+1) + "] \n");
          songInfo = MediaFile.readString();
        }
   }
}
