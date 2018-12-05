
/**
 * Write a description of class Caesar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Caesar{
public static void main(String args[]){
    String phrase = args[0];
    //First Argument
    
    //Second argument
    //The shift of the letters in the caesar Cipher
    char characters[] = phrase.toCharArray();
    //Sending the input characters into a character array 
    int shift = 4;
    int remainder = shift % 26;     
    //The shift = value K       
    for( int i=0; i < characters.length; i++)
    {
        if ((Character.isUpperCase(characters[i]))== true)
        {
            if((int)(characters[i]) + remainder >= 90)
            {
                characters[i] = (char)(characters[i]-(26-remainder));                   
            }
            else
            {
                characters[i] = (char)(characters[i]+remainder);
            }
        }
        else if (Character.isLowerCase(characters[i])==true)
        {
            if ((int)(characters[i] + remainder) >= 122)
            {
                characters[i] = (char)(characters[i] - (26-remainder));
            }
            else
            {
                characters[i] = (char)(characters[i]+remainder);
            }
        }   
    }
    for(int i =0; i< characters.length;i++)
    {
         System.out.println (characters[i]);
    }
       
}
}
