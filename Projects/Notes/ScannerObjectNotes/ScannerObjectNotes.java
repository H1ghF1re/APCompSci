/*
 * Scanner Object Notes
 * 
 * @author Lewis Brown
 * @version 9.9.2019
 */
import java.util.Scanner;
public class ScannerObjectNotes
{
    public static void main ( String args[] )
    {
        int numInput = 0;
        //1. Instantiate a Scanner Object
        Scanner input = new Scanner( System.in );
        
        while ( numInput != -1 )
        {
            //2. prompt the user for input using System.out.println
            System.out.println( "Enter a positive integer (type -1 to stop):" );
        
            //3. Scanner method assigns a value to your variable (using nextInt()., nextDouble()., nextLine() );
            numInput = input.nextInt();
            System.out.println( "Your number is: " + numInput );
        } //end while
        
        System.out.println( "OK... Cya!" );
    } //end main method

} //end class