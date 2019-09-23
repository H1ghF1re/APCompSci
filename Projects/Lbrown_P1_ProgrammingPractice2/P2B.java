/*
 * Programing Practice P2B
 * 
 * @author Lewis Brown
 * @version 9.12.2019
 */
import java.util.Scanner;
public class P2B
{
    public static void main ( String args[] )
    {
        int Cookies = 0;
        Scanner input = new Scanner( System.in );
        while (Cookies > -1 )
        {
            System.out.println( "How many cookies would you like to eat?" );
            Cookies = input.nextInt();
            if ( Cookies <= 12 )
            {
                while ( Cookies > 0 )
                {
                    if (Cookies == 1)
                    {
                        System.out.println( "I have " + Cookies + " COOKIE!" );
                        System.out.println( "I ate ALL the cookies :(");
                    }
                    else
                    System.out.println( "I have " + Cookies + " cookies" );
                 Cookies --;
                }
            }
            if ( Cookies > 12 )
            System.out.println( "Sorry, " + Cookies + " is way too many cookies!" );
        } //end while loop
    } //end main method
    
} //end class