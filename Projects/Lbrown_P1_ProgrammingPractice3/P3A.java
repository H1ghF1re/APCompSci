/*
 * Programming Practice 3A
 * 
 * @author Lewis Brown
 * @version 9.20.2019
 */
import java.util.Scanner;
public class P3A
{
    public static void main( String args[] )
    {
        double num1 = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;
        int loop = 1;
        Scanner input = new Scanner( System.in );
        while (loop != -1)
        {
            System.out.println( "Run Program? (1 to run, -1 to quit)" );
            loop = input.nextInt();
            
            if (loop == 1 )
            {
                double greatestnumber = 0.0;
                
                while ( greatestnumber == 0.0 )
                {
                    System.out.println( "Let's find the greatest of 3 numbers." );
                    
                    System.out.println( "Enter your first number:" );
                    num1 = input.nextDouble();
                    
                    System.out.println( "Enter your second number:" );
                    num2 = input.nextDouble();
                    
                    System.out.println( "Enter your third number:" );
                    num3 = input.nextDouble();
                    
                    greatestnumber = Math.max( num1, num2 );
                    greatestnumber = Math.max( greatestnumber, num3);
                    
                    System.out.println( "The greatest number is: " + greatestnumber + "!\n" );
                }
            }
        }
    }
}