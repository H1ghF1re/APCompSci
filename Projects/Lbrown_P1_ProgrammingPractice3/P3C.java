/*
 * Programming Practice 3C
 * 
 * @author Lewis Brown
 * @version 9.23.2019
 */
import java.util.Scanner;
public class P3C
{
    public static void main( String args[] )
    {
        String FavoriteTeacher = "null";
        int AgeWhenTaught = 0;
        String Subject = "null";
        String Catchphrase = "null";
        int RoomNumber = 0;
        String run = "y";
        
        Scanner input = new Scanner (System.in);
        
        while (run.equals("y"))
        {
            System.out.println("Welcome to \"All About You\"! Press Y to continue, and N to quit.");
            run = input.nextLine();
            if (run.equals("y"))
            {
                System.out.println("Who was your favorite teacher?");
                FavoriteTeacher = input.nextLine();
                
                System.out.println("How old were you when they taught you?");
                AgeWhenTaught = input.nextInt();
                
                System.out.println("What Subject did they teach?");
                input.nextLine();
                Subject = input.nextLine();
                
                System.out.println("What was their catchphrase?");
                Catchphrase = input.nextLine();
                
                System.out.println("What was their room number?");
                RoomNumber = input.nextInt();
                input.nextLine();
                
                System.out.println("Your favorite teacher is " + FavoriteTeacher +
                    ", and they liked to say: \"" + Catchphrase + 
                    "\".\nYou had them when you were " + AgeWhenTaught + 
                    " years old.\nThey taught you " + Subject + " and their room number was " + RoomNumber + ".\n" );
            }
        }
    }
}