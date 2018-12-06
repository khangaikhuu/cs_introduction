
/**
 * Write a description of class Week15TExercise3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week15TExercise3
{
    public void mealCost(double cost, int tipP, int taxP){
        double tip = (double)tipP / 100;
        double tax = (double)taxP / 100;
        double tip1 = cost * tip;
        double tax1 = cost * tax;
        double total = cost + tip1 + tax1;
        System.out.println("Total meal cost is: " + total);
    }
}
