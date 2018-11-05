public class FiftySix
{
    int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[] array1 = new int[3];
    int[] array2 = new int[3];
    public void matrix(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (i == j)
                {
                    array1[i] = array[i][j];
                }
            }
        }
        for (int i = 0; i < array1.length; i++){
            array2[i] = array1[i] * array1[i];
        }
        int sum = 0;
        for (int i = 0; i < array2.length; i++){
            sum += array2[i];
        }
        System.out.println(sum);
    }
}
