/*
 * Scanner Glitch Notes
 * 
 * @author Lewis Brown
 * @version 9.19.2019
 */
import java.util.Scanner;
public class ScannerGlitchNotes
{
    public static void main ( String args[] )
    {
       double decimal = 0.0;
       String name = "";
        
       Scanner input = new Scanner( System.in );
       
       decimal = Math.max( 3.14, decimal );
       System.out.println( decimal );
       
       System.out.println( "Enter a decimal value: " );
       decimal = input.nextDouble();
       /*
        * issue: when nextInt or nextDouble is used a space is left in the "Keyboard Buffer".
        * therefore, if you try to use the same scanner to get a String, it sees the space,
        * and thinks you already hit enter, so you are unable to enter a String
        */
        
       System.out.println( "Your number is: " + decimal );
       
       /* The Fix */
       input.nextLine();
       
       System.out.println( "Enter your name: " );
       name = input.nextLine();
       
       System.out.println( "Your name is: " + name );
    }
    
}