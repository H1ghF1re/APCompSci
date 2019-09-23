/*
 * Programming Practice 2C
 * 
 * @author Lewis Brown
 * @version 9.12.2019
 */
import java.util.Scanner;
public class P2C
{
    public static void main ( String args[] )
    {
        int number = (1+(int)(Math.random()*100));
        int guess = 0;
        int tries = 0;
        Scanner input = new Scanner( System.in );
        
        System.out.println( "I am thinking of a number from 1 - 100, can you guess it?" );
        while ( guess != number )
        {
            guess = input.nextInt();
            if ( guess > number )
            {
                System.out.println( guess + " is too high. Try again." );
                tries ++;
            }
            if ( guess < number )
            {
                System.out.println( guess + " is too low. Try again." );
                tries ++;
            }
        } //end while
        System.out.println( guess + " is correct! Great job! It only took you " + tries + " tries!." );
    } //end main method
    
} //end class