/*
 * Programming Practice 3B
 * 
 * @author Lewis Brown
 * @version 9.23.2019
 */
import java.util.Scanner;
public class P3B
{
    public static void main( String args[] )
    {
        double side1 = 0.0;
        double side2 = 0.0;
        double side3 = 0.0;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        String run = "y";
        Scanner input = new Scanner( System.in );
        
        while ( run.equals( "y" ) )
        {
            int triangletype = 0;
            System.out.println( "Would you like to use the Triangle Type Detector? (y/n)" );

            run = input.nextLine();
            
            if ( run.equals( "y" ) )
            {
                while ( triangletype == 0 )
                {
                    System.out.println( "Enter the first side:" );
                    side1 = input.nextDouble();
                    
                    System.out.println( "Enter the second side:" );
                    side2 = input.nextDouble();
                    
                    System.out.println( "Enter the third date:" );
                    side3 = input.nextDouble();
                    
                    c = Math.max( side1, side2 );
                    a = Math.min( side1, side2 );
                    b = Math.min( c, side3 );
                    c = Math.max( c, side3 );
                    
                    if ( a + b > c)
                    {
                        if ( (Math.pow(a,2)) + (Math.pow(b,2)) == (Math.pow(c,2)))
                        {
                            System.out.println( "This is a Right Triangle.\n" );
                            triangletype = 1;
                        }
                        
                        if ( (Math.pow(a,2)) + (Math.pow(b,2)) > (Math.pow(c,2)))
                        {
                            System.out.println( "This is an Obtuse Triangle.\n" );
                            triangletype = 2;
                        }
                        
                        if ( (Math.pow(a,2)) + (Math.pow(b,2)) < (Math.pow(c,2)))
                        {
                            System.out.println( "This is an Acute Triangle.\n" );
                            triangletype = 3;
                        }
                    }
                    else
                    {
                        System.out.println( "This is not a triangle, try again.\n" );
                        triangletype = -1;
                    }
                    input.nextLine();
                }
            }
        }
    }
}