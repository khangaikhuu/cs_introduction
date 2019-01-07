
/**
 * Write a description of class DecemberFourteen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DecemberFourteen
{
    public void gameResult(int numOfGames, int[] gameScores){
        int max = 0;
        int min = 0;
        int first = gameScores[0];
        int second = gameScores[0];
        for (int i = 1; i < gameScores.length; i++){
            if (gameScores[i] > first){
                max = max + 1;
            }
            if (gameScores[i] < second){
                min = min + 1;
            }
        }
        System.out.println((max - 1) + " " + (min - 1));
    }
}
