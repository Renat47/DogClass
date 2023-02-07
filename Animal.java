import java.util.ArrayList;

public abstract class Animal {
    private int age;
    public Animal()
    {
        this.age = 0;
    }
    public void setAge(int newAge)
    {
        this.age = newAge;
    }
    public int getAge()
    {
        return age;
    }
    public abstract void eat();
    //error happened because Animal was not an abstract class, also Dog has to override






}
