public class Class
{
    public int [] n =  {1, 3, 4, 5 , 7, 8, 9, 10};
    
    public void Hello()
    {
        for(int j = 0; j < n.length; j++)
        {
            if(isPrime(n[j]))
            {
                System.out.println(n[j]);
            }
        }
    }
    
    private boolean isPrime(int n) {
    for(int i=2;i<n;i++) {
        if(n%i==0){
             return false;
        }
    }
    return true;
}
}