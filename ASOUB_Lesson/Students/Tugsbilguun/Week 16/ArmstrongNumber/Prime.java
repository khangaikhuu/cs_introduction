
/**
 * Write a description of class Prime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prime
{
    private int a;
    private int i,m=0,flag=0;  
    
    public void checkPrime(int n){
        int m=n/2;
        if(n==0||n==1){  
           System.out.println(n+" is not prime number");      
        }else{  
        for(i=2;i<=m;i++){      
            if(n%i==0){      
                System.out.println(n+" is not prime number");      
                flag=1;      
                break;      
            }      
        }      
        if(flag==0)  { System.out.println(n+" is prime number"); }  
       
    }
}
}
