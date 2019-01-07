
/**
 * Write a description of class Week16WExercise3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week16WExercise3
{
    public void clock(int hour, int minutes){
        if (minutes == 0){
            System.out.println(hour + " o' clock");
        }
        if (minutes > 30){
            int dif = 60 - minutes;
            int next = hour + 1;
            System.out.println(dif + " minutes to " + next);
        }
        if (minutes < 30){
            System.out.println(minutes + " minutes past " + hour);
        }
    }
}
