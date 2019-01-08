
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public int [] a = {1, 2, 3, 4, 10, 12, -1, 5, 17, 8, 9, 10, 8,7};
    public int [] b = new int [a.length];
    public void yo (){
        for(int i=0;i<a.length;i++)  
        if(a[i]%2!=0)
        {
           b[i]=a[i]*10;
        System.out.println(b[i]);
        
    }
    else
    {
        b[i]=a[i]*3;
        System.out.println(b[i]);
    }
}}
