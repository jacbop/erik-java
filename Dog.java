
public class Dog implements Animal
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
    public AnimalType kind() {
        return AnimalType.DOG;
    }
}