
public class Monkey implements Animal
{
    String monkeyName;
    String monkeyLook;
    String monkeySound;
    public Monkey(String monkeyName, String monkeyLook, String monkeySound)
    {
        this.monkeyName = monkeyName;
        this.monkeyLook = monkeyLook;
        this.monkeySound = monkeySound;
    }
    public String sound() {
        return monkeySound;
    }
    public String look() {
        return monkeyLook;
    }
    public String name() {
        return monkeyName;
    }
    public AnimalType kind() {
        return AnimalType.MONKEY;
    }
}