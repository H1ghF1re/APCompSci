/*
 * Programming Practice 2A
 * 
 * @author Lewis Brown
 * @version 9.11.2019
 */
public class P2A
{
    public static void main ( String args[] )
    {
        int CokeBottles = 99; //declare CokeBottles variable
        while ( CokeBottles > 0 ) //loop from 99 to 0
        {
            if ( CokeBottles == 2 ) //check if there are 2 bottles left
            {
                System.out.println( CokeBottles + " bottles of coke on the wall" );
                System.out.println( CokeBottles + " bottles of coke" );
                System.out.println( "You take one down, pass it 'round." );
                System.out.println( (CokeBottles - 1) + " bottle of coke on the wall\n\n" );
            } //end if statement
            else
            {
                if (CokeBottles == 1 ) //check if there is 1 bottle left
                {
                    System.out.println( CokeBottles + " bottles of coke on the wall" );
                    System.out.println( CokeBottles + " bottles of coke" );
                    System.out.println( "You take one down, pass it 'round." );
                    System.out.println( "No more bottles of coke on the wall  \n\n" );
                } //end if statement
                else
                {
                    System.out.println( CokeBottles + " bottles of coke on the wall" );
                    System.out.println( CokeBottles + " bottles of coke" );
                    System.out.println( "You take one down, pass it 'round." );
                    System.out.println( (CokeBottles - 1) + " bottles of coke on the wall \n\n" );
                } //end else statement
            } //end else statement
         CokeBottles --; //subtract 1 from CokeBottles
        } //end while loop
    } //end main method
    
} //end class