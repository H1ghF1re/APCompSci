/*
 * My First Program
 * @author Lewis Brown
 * @version ( 9.4.2019 )
 */
public class MyFirstProgram
{
    public static void main ( String args[] )
    {
        //1. Declare and initialize variables
        // FOUR DATA TYPES
        int age = 16; // declaring an integer variable and initializing it with a value
        int counter; // Just declaring a variable
        counter = 1; // initializing it with the value of 10
        double weight = 120.512; //double is for decimals
        String name = "Lewis"; //Strings are used for text
        boolean test = false; //for testing true or false
        
        
        //2. Provide code to perform a task
        System.out.println( "Hello World\n" );
        System.out.println( "My name is : " + name );
        System.out.println( "I weigh " + weight + " kilos" );
        
        while ( counter <= 10 )
        {
            if ( counter == 7 )
                System.out.println( "Ooh!.. " + counter + " is my favorite number!" );
            else
                System.out.println( "Counter = " + counter );
            //counter = counter - 1;
            counter++;  //subtract 1 from the counter (shortcut)
        } //end while
        
    } //end main method
    
} //end class 