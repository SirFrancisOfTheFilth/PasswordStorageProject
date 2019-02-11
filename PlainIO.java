
/**
 * Write a description of class PlainIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.PrintWriter;

public class PlainIO
{
    
   File plain = new File("plain.txt");
   PrintWriter decrypt;
   
   public PlainIO(String str, char[] arr){
        try{
            PrintWriter decrypt = new PrintWriter(plain);
        }catch(Exception e){
            System.out.println("no");
        }
        
        decrypt.write(str);
        decrypt.write(arr);
        
   }
}
