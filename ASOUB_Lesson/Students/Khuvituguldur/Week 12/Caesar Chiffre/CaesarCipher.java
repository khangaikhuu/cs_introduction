import java.util.Scanner;
/**
 * Write a description of class CaesarChiffre here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CaesarCipher
{
    public static String encrypt(String plain, int key){
        if (key > 26){
            key = key%26;
        }
        else if (key < 0){
            key = (key%26) + 26;
        }
        String cipher = "";
        int length = plain.length();
        for (int i = 0; i < length; i++){
            char ch = plain.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c = (char)(ch + key);
                    if (c > 'z'){
                        cipher += (char)(ch - (26-key));
                    }
                    else {
                        cipher += c;
                    }
                }
                else if (Character.isUpperCase(ch)){
                    char c = (char)(ch + key);
                    if (c > 'Z'){
                        cipher += (char)(ch - (26-key));
                    }
                    else {
                        cipher += c;
                    }
                }
            }
            else {
                cipher += ch;
            }
        }
        return cipher;
    }
    
    public static void main(String...s){
        String message, decryptedMessage = "";
        int key;
        char ch;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a message: ");
        message = sc.nextLine();
        
        System.out.println("Enter key: ");
        key = sc.nextInt();
 
        for(int i = 0; i < message.length(); ++i){
            ch = message.charAt(i);
            
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - key);
                
                if(ch < 'a'){
                    ch = (char)(ch + 'z' - 'a' + 1);
                }
                
                decryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - key);
                
                if(ch < 'A'){
                    ch = (char)(ch + 'Z' - 'A' + 1);
                }
                
                decryptedMessage += ch;
            }
            else {
                decryptedMessage += ch;
            }
        }
        
        System.out.println("Decrypted Message = " + decryptedMessage);
    }
}
