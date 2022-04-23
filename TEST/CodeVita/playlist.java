import java.util.*;
class Solution {
     static int WaysSongsToPlay(int totalSong, int playList, int gap) {
 
        long[][] memoryArray = new long[playList+1][totalSong+1];
        memoryArray[0][0] = 1;
        for (int i = 1; i <= playList; ++i)
            for (int j = 1; j <= totalSong; ++j) {
                memoryArray[i][j]= memoryArray[i][j] + memoryArray[i-1][j-1] * (totalSong-j+1);
                memoryArray[i][j]= memoryArray[i][j] + memoryArray[i-1][j] * Math.max(j-gap, 0);
            
            }
        return (int) memoryArray[playList][totalSong];
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalSongs=sc.nextInt();
        int playlist=sc.nextInt();
        int gap=sc.nextInt();
        System.out.println( WaysSongsToPlay(totalSongs, playlist, gap) );
    }
}