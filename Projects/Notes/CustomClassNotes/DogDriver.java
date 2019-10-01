/*
 * Dog Class Driver
 * 
 * @author Lewis Brown
 * @version 10.1.2019
 */
public class DogDriver
{
    public static void main ( String args[] )
    {
        Dog Stray = new Dog();
        Dog Snoopy = new Dog( "Charlie Brown", "Snoopy", "Beagle", 60, 75);
        System.out.println( Stray );
        System.out.println( Snoopy );
        Snoopy.setName( "Sport" );
        System.out.println( Snoopy );
        System.out.println( "The name of Snoopy is " + Snoopy.getName()); // end examples
        System.out.println( Snoopy.setDogYears() + "\n" );
        
        Dog Rufus = new Dog( "Drew", "Rufus", "Lab",  7, 100); //create new dog, Rufus
        System.out.println( Rufus );//print Rufus' info
        System.out.println( "Rufus' age in dog years is " + Rufus.setDogYears() );//Print Rufus' age in dog years
        
    }
    
} //end class