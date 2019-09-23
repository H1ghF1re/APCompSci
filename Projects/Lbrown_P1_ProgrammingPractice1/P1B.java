/*
 * Programming Practice 1
 * 
 * @author Lewis Brown
 * @version 9.5.2019
 */
public class P1B
{
    public static void main ( String args[] )
    {
        int A = 20;
        int B = 40;
        if ( A == B )
          System.out.println( "A, whose value is " + A + " is equal to B, whose value is " + B + "." ); //check if equal
          else
          {
              if ( A > B )
                System.out.println( "A, whose value is " + A + " is greater than B, whose value is " + B + "." ); //check if A > B
                else
                {
                  if ( A < B )
                    System.out.println( "A, whose value is " + A + " is less than B, whose value is " + B + "." ); // check if A < B
                    else
                    System.out.println( "Error. Numbers are neither equal to nor greater/less than each other." );
                }
            }
    }
}