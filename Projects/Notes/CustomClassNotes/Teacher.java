public class Teacher
{
    String name, catchphrase;
    int roomNumber;
    
    //Start Constructors
    Teacher()
    {
        name = "null";
        catchphrase = "null";
        roomNumber = 0;
        
    }
    
    Teacher( String inputName, String inputCatchphrase, int inputRoomNumber)
    {
        name = inputName;
        catchphrase = inputCatchphrase;
        roomNumber = inputRoomNumber;
        
    }
    //End Constructors
    
    //Start Processing Methods
    public void setName( String newName )
    {
        name = newName;
        
    }
    
    public String getName()
    {
        return name;
        
    }
    
    public void setCatchphrase( String newCatchphrase )
    {
        catchphrase = newCatchphrase;
        
    }
    
    public String getCatchphrase()
    {
        return catchphrase;
        
    }
    
    public void setRoomNumber( int newRoomNumber )
    {
        roomNumber = newRoomNumber;
        
    }
    
    public int getRoomNumber()
    {
        return roomNumber;
        
    }
    
}
