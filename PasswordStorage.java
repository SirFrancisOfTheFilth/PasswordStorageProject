
/**
 * Write a description of class PasswordStorage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.io.File;

public class PasswordStorage
{
   
   Scanner scan = new Scanner(System.in);
    
   public PasswordStorage(){
       System.out.println("DO YOU WANT TO ENCRYPT AND STORE A PASSWORD, DECRYPT AN EXISTING PASSWORD, OR PRODUCE A RANDOM PASSWORD?");
       int newInt = scan.nextInt();
       scan.nextLine();

    
       
       
           if(newInt == 0){//encryption to file
             System.out.println("ENTER A STRING FOR ENCRYPTION");
             String caseZero = scan.nextLine();
             
             Caesar call = new Caesar();
             int[] vigenere = call.setVigenere(caseZero);
             for(int i = 0; i < vigenere.length; i++){
                 System.out.print(vigenere[i] + " ");
             }
             System.out.println();
             System.out.println("CIPHERTEXT: " + call.det(caseZero, vigenere));
             FileIO file = new FileIO(0, call.det(caseZero, vigenere), vigenere);
             
            } else if(newInt == 1){ //decryption from file
             System.out.println("DECRYPTION");
             String caseOne = scan.nextLine();
             Caesar call2 = new Caesar();
             int[] vigenere = call2.setVigenere(caseOne);
             FileIO file = new FileIO(1, call2.det(caseOne, vigenere), vigenere);
             
            }else if(newInt == 2){ //production to file
             System.out.println("PRODUCTION");
             String caseTwo = scan.nextLine();
             Caesar call3 = new Caesar();
             int[] vigenere = call3.setVigenere(caseTwo);
             FileIO file = new FileIO(2, call3.det(caseTwo, vigenere), vigenere);
            }
             
             
       }
}
   
