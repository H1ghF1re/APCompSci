/*
 * Custom Dog Class
 * 
 * @author Lewis Brown
 * @version 10.1.2019
 */
public class Dog
{
    
    //1. Define instance variable
    
    String owner, dogName, breed;
    int age, dogWeight, dogYears;
    
    //2. write constructors
    
    Dog() //Zero-arg constructor
    {
        owner = "unknown";
        dogName = "unknown";
        breed = "stray";
        age = 0;
        dogWeight = 0;
        
    } //end constructor
    
    Dog ( String inputOwner, String inputDogName, String inputBreed, int inputAge, int inputWeight) //Multi-arg constructor
    {
        owner = inputOwner;
        dogName = inputDogName;
        breed = inputBreed;
        age = inputAge;
        dogWeight = inputWeight;
        
    } //end multi-arg constructor
    
    //3. write processing methods
    
    public void setOwner( String newOwner )
    {
        owner = newOwner;
        
    }
    
    public String getOwner()
    {
        return owner;
        
    }
    
    public void setName( String newName )
    {
        dogName = newName;
        
    } // end setter method
    
    public String getName()
    {
        return dogName;
        
    }
    
    public void setBreed( String newBreed )
    {
        breed = newBreed;
        
    }
    
    public String getBreed()
    {
        return breed;
        
    }
    
    public void setAge( int newAge )
    {
        age = newAge;
        
    }
    
    public int getAge()
    {
        return age;
        
    }
    
    public void setWeight( int newWeight )
    {
        dogWeight = newWeight;
        
    }
    
    public int getWeight()
    {
        return dogWeight;
        
    }
    
    public String setDogYears()
    {
        dogYears = age * 7;
        String str = "" + dogYears;
        return str;
    } // end processing methods
    
    //4. provide a toString() method
    
    public String toString()
    {
        String str = "This dog's owner is " + owner + ". It's name is " + dogName + 
                     ".\n It is " + age + " years old, " + dogWeight + " pounds, and is a " + breed + ".";
        return str;
    } //end toString method
    
} //end dog class