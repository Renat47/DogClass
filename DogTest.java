// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


public class DogTest
{
    public static void main(String[] args)
    {
        Labrador labrador = new Labrador("Bob","Orange");
	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.bark());
        System.out.println(labrador.getName() + " says " + labrador.bark());
        Yorkshire yorkshire = new Yorkshire("Doo",25);
        yorkshire.waddle();
        //labrador.waddle();
        //doesn't work because Dog class doesn't have this method, only Yorkshire class does
        //Labrador doesn't inherit that method
	

    }
}
