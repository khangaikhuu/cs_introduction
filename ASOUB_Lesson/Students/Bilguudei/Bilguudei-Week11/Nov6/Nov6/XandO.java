

public class XandO
{
    private int PLAYING=0, DRAW=1, CROSS_WON=2, NOUGHT_WON=3;
    public void main(int x)
   {
   
      if (x== CROSS_WON)
      {
         System.out.println("X won! Bye!");
      }
      else if (x== NOUGHT_WON)
      {   
      System.out.println("O won! Bye!");
      }
    else{
    
         System.out.println("It's a Draw! Bye!");
        }
   }
}
