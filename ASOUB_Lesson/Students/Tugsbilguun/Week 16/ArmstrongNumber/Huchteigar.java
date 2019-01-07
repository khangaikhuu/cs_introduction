
/**
 * Write a description of class Huchteigar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Huchteigar
{
   public void checkArmstrongNumber(int n){
    int c=0,a,temp;  
    temp=n;  
    
    while(n>0)  
    {  
        a=n%10;  
        n=n/10;  
        c=c+(a*a*a);  
    }  
    if(temp==c)  
        System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
   
}
