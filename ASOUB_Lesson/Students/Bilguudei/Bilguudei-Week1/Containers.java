
public class Containers
{
    //Array 
    int[] cont1={9,5,7,8,4};
    public int getSize()
    {
        return cont1.length;
    } 
    private Apple[] apples=new Apple [3];
    public Containers(Apple a1, Apple a2, Apple a3)
    {
        apples[0]= a1;
        apples[1]= a2;
        apples[2]= a3;
    }
    private List<Apple> applelist=new ArrayList();
    
}
