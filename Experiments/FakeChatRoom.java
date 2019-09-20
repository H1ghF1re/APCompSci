/*
 * Fake Chat Room
 *
 * @author Lewis Brown
 * @version 9.17.2019
 */
import java.util.Scanner
public class ChatRoom
{
  public static void main( String args[] )
  {
  String Name;
  String Message;
  int EnterRoom;
  Scanner input = new Scanner( System.in );
  
  System.out.println( "Would you like to enter the room? (1 to enter, 0 to leave" )
  while ( EnterRoom == 1 )
    {
      System.out.println( "Please enter your username." );
      input.nextLine();
      Name = input.nextLine();
      System.out.println( "Your username is " + Name + "." );
      System.out.println( "Welcome to the room. Press 0 to leave")
      while ( EnterRoom == 1 )
      {
        input.nextLine();
        Message = input.nextLine();
        System.out.println( Name + " : " + Message );
      }
    }
  }
}
