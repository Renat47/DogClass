// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.util.ArrayList;

public class DogTest
{
    public static void main(String[] args)
    {
        //created Labrador object
        Labrador labrador = new Labrador("Bob","Orange");
        //created Dog object
	Dog dog = new Dog("Spike");
    //Dog barks
	System.out.println(dog.getName() + " says " + dog.bark());
    //Labrador barks
        System.out.println(labrador.getName() + " says " + labrador.bark());
        //Created Yorkshire object
        Yorkshire Doo = new Yorkshire("Doo",25);
        //Yorkshire object barks
        System.out.println(Doo.bark());
        //Yorkshire waddles
        Doo.waddle();
        //Labrador waddles
        labrador.waddle();
        //doesn't work because Dog class doesn't have this method, only Yorkshire class does
        //Labrador doesn't inherit that method
        //New objects for Dog list
        Dog labrador2 = new Labrador("Bib","Orange");
        Dog yorkshire2 = new Yorkshire("Dii", 25);
        //Dog list + adding the objects
        Dog[] dogs = new Dog[3];
        dogs[0] = dog;
        dogs[1] = labrador2;
        dogs[2] = yorkshire2;
        //regular loop
        for(int i =0; i<dogs.length; i++)
        {
            System.out.println(dogs[i].bark());
        }
        //for each loop
        for(Dog i : dogs)
        {
            System.out.println(i.bark());
        }
        //casted labrador to labrador because it was saved as a Dog but Dog doesn't have a
        //waddle method so it won't compile
        ((Labrador)dogs[1]).waddle();

        //now same stuff with arraylist
        ArrayList <Dog> doggos = new ArrayList<>();
        doggos.add(dog);
        doggos.add(labrador2);
        doggos.add(yorkshire2);
        for(int i =0; i<dogs.length; i++)
        {
            System.out.println(doggos.get(i).bark());
        }
        //for each loop
        for(Dog i : doggos)
        {
            System.out.println(i.bark());
        }
        //casted
        ((Labrador)doggos.get(1)).waddle();


    }
}
