
/**
 * Write a description of class Project2 here.
 *
 * @author (Manal)
 * @version (Week 10 Monday)
 */
public class Project2
{
    public static void main(String[] args){
	String orginalWord = "tattarrattat";
	StringBuilder sb = new StringBuilder(orginalWord);

	String reversedWord = new String(sb.reverse());
	System.out.println("Original word " + orginalWord );
	System.out.println("Reversed word " + reversedWord );

	if(orginalWord.toLowerCase().equals(reversedWord.toLowerCase())){
	    System.out.println("The word is Palindrome");
	} else {
	    System.out.println("The word is not Palindrome");
	}
     }
}
