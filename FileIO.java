
/**
 * Write a description of class FileIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileIO
{
    
    File pass = new File("rand.txt");
    
    PrintWriter rand;

   
    
    public FileIO(int integer,  String string, int[] associatedArray){
        char[] newchar = new char[associatedArray.length];
        
        try{
            PrintWriter rand = new PrintWriter(pass);
        }catch(Exception e){
            System.out.println("no");
        }
        
        
        if(integer == 0){
            
                for(int i = 0; i < associatedArray.length; i++){
                    int temp = associatedArray[i];
                    char elem = (char)(temp + 48);
                    newchar[i] = elem;
                    System.out.println(elem);
                }
                EncryptIO encrypt = new EncryptIO(string, newchar);
           
                
        } else if(integer == 1){
               
                for(int i = 0; i < associatedArray.length; i++){
                    newchar[i] = (char)(associatedArray[i] + '0' );
                }
                PlainIO plain = new PlainIO(string, newchar);
               
       } else if(integer == 2){
           
                for(int i = 0; i < associatedArray.length; i++){
                    newchar[i] = (char)(associatedArray[i] + '0' );
                }
                rand.write(string);
                rand.write(newchar);
                
            
        }
        
    }
}
