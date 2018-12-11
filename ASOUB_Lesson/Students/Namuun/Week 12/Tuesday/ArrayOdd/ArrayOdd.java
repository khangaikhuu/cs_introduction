
/**
 * Write a description of class ArrayOdd here.
 *
<<<<<<< HEAD
 * @author (Namuun)
=======
 * @author (your name)
>>>>>>> 140bf2b6c800151e742ba0262df51823fb5d8f36
 * @version (a version number or a date)
 */
public class ArrayOdd
{
    int [] array = {1, 2, 3, 4, 5, 6};
    int even = 0, odd = 0;
    
    public void ArrayOdd ()
    {
<<<<<<< HEAD
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 != 0)
            {
                System.out.println (array[i]);
            }
            else
            {
                
            }
        }
    }
} 
=======
        for (i = 0; i < array.length; i++)
        {
            if (i % 2 == 0)
            {
                even += array [i];
            }
            else
            {
                odd += array [i];
            }
        }
    }
}
>>>>>>> 140bf2b6c800151e742ba0262df51823fb5d8f36
