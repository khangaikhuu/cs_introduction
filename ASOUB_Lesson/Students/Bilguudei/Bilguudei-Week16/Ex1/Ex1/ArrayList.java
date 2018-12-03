import java.util.Scanner;
 
public class ArrayList {
 
    public static void main(String[] args) {
 
        int int1, int2;
         
         
 
        Scanner keyboard = new Scanner(System.in);
 
        System.out.print("Please enter the staring number: ");
 
        int1 = keyboard.nextInt();
 
        System.out.print("please enter the ending number: ");
 
        int2 = keyboard.nextInt();
         
        int[] numbers = { int1 };
 
        int[] legnth = { int2 };
 
     
 
         
        System.out.print("The array size is: " + legnth);
         
        int evens = 0;
        for (int index = 0; index < numbers.length; index++) {
            if (index % 2 == 0) {
                evens++;
 
                if (numbers[index] % 2 == 0) {
                    evens++;
                }
                System.out.print(evens + " ");
 
                keyboard.close();
 
            }
 
        }
 
    }
 
}