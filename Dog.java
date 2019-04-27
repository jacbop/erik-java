
public class Dog extends Animal
{
    String dogName;
    String dogLook;
    String dogSound;
    public Dog(String dogName, String dogLook, String dogSound)
    {
        this.dogName = dogName;
        this.dogLook = dogLook;
        this.dogSound = dogSound;
    }
    public String sound() {
        return dogSound;
    }
    public String look() {
        return dogLook;
    }
    public String name() {
        return dogName;
    }
    public String kind() {
        return "dog";
    }
}