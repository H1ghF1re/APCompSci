public class P1C
{
    public static void main ( String args[] )
    {
        int counter = 1; //initiates counter and assigns it's value
        
        while ( counter <= 25) // begin while loop with limit of 25
        {
            if ( counter % 5 == 0 ) // check for multiple of five
            System.out.println( counter + " is a multiple of FIVE." );
            else //else statement for checking even or odd
            {
                if ( counter % 2 == 0 ) //check for even
                System.out.println( counter + " is an even number." );
                else //if neither if statements are true, number is odd
                System.out.println( counter + " is an odd number." );
            }
            counter ++; //counts up from 1
        }
    }
    
}