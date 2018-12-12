
/**
 * Write a description of class Week15TExercise2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week15TExercise2
{
    public void libraryCalc(int day, int month, int year, int day1, int month1, int year1){
        int dayfine = 15;
        int monthfine = 500;
        int yearfine = 10000;
        
        if (day == day1){
            if (month == month1){
                if (year == year1){
                    System.out.println("Fine: 0 Hackos");
                }
            }
        }
        if (day > day1 && year == year1){
            int dif = day - day1;
            System.out.println("Fine: " + (dif * dayfine) + " Hackos");
        }
        if (month > month1 && year == year1){
            int dif1 = month - month1;
            System.out.println("Fine: " + (dif1 * monthfine) + " Hackos");
        }
        if (year > year1 && ((day == day1) || (day > day1)) && ((month == month1) || (month > month1))){
            int dif2 = year - year1;
            System.out.println("Fine: " + (dif2 * yearfine) + " Hackos");
        }
    }
}
