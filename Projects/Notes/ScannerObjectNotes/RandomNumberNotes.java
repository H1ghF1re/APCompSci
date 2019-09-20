/*
 * RandomNumberNotes
 * 
 * @author Lewis Brown
 * @version 9.10.2019
 */
public class RandomNumberNotes
{
    public static void main ( String args[] )
    {
        int x = -22, y = 3;
        double z = -3.14, w = 0.0;
        int counter = 0;
        
        /* Some Math Examples */
        
        System.out.println( Math.abs(x) ); //returns the absolute value of the number
        System.out.println( Math.pow( y, w ) ); //returns y raised to the w
        w = x/y;
        System.out.println( "The value of w is: " + w + "." ); //returns ??
        
        /* Random number example */
        
        while ( counter < 100 )
        {
            int n = (1+(int)(Math.random()*10));
            System.out.println( "Random #" + counter + " = " + n );
            counter++;
        }
    } //end main method

} //end class