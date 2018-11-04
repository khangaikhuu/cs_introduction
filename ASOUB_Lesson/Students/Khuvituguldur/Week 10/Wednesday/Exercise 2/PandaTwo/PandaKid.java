
/**
 * Write a description of class PandaKid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PandaKid
{
   private int[] panda = {1, 3, 4,5 , 10, 15, 18};
   public int kermode()
   {
       int mulituply = 1;
       for(int a = 0; a < panda.length; a++)
       {
           mulituply = mulituply * panda[a]; 
       }
       return mulituply;
   }
}