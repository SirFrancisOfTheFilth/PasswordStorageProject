
/**
 * Write a description of class EncryptIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.PrintWriter;
public class EncryptIO
{
    
    File encrypt = new File("encrypt.txt");
    
    public EncryptIO(String str, char[] elems)
    {   
        try{
            PrintWriter encrypter = new PrintWriter(encrypt);
            System.out.println(str);
            encrypter.println(str);
            encrypter.println(elems);
            System.out.println("ELEMENT HAS BEEN ADDED TO FILE.");
        }catch(Exception e){
            System.out.println("no");
        }
        

        
      
        
    }

}
