
public class minus
{
    private int[] array= {11,12,13,14,15};
    private int[] array2=new int[array.length];
    public int[] minusArray(){
    for (int i=0; i<array.length; i++){
        array2[i]=array[i]-10;
    }
    return array2;
 }
}