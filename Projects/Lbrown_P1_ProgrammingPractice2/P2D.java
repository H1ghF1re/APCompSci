/*
 * Programming Practice P2D
 * 
 * @author Lewis Brown
 * @version 9.13.2019
 */
import java.util.Scanner;
public class P2D
{
    public static void main ( String args[] )
    {
        int high = 100;
        int low = 1;
        int guess = 50;
        int tries = 0;
        int WinCondition = -1;
        int PlayGame = 2;
        Scanner input = new Scanner( System.in );
        
        System.out.println( "Welcome to Guess The Number! Would you like to play? (1/0)" );
        PlayGame = input.nextInt();
        while ( PlayGame == 1 ) //check if we want to run the game
        {
        WinCondition = -1;
        guess = 50;
        tries = 0;
            while ( WinCondition != 1 ) //loop until WinCondition is met
            {
                System.out.println( "My guess is " + guess + ". is it correct? (2 for high, 0 for low, 1 for correct)" );
                WinCondition = input.nextInt();
                tries ++;
                if ( WinCondition == 1 ) // if correct
                {
                    System.out.println( "I got it! It only took me " + tries + " tries this time." );
                }
                else
                    if ( WinCondition == 2 ) //if high
                    {
                        guess = ( guess + low ) / 2;
                    }
                    else
                        if ( WinCondition == 0 ) //if low
                        {
                            guess = ( guess + high ) / 2;
                        }
                        else //if wrong input
                        {
                            System.out.println( "Error. Try Again." );
                            tries --; //subtract try if incorrect
                        }
                        
            }
        System.out.println( "Play Again? (1/0)" ); //allow playing again without restart
        PlayGame = input.nextInt();
        }
        
    } //end main method
    
} //end class