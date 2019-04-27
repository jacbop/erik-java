
public class Lion extends Animal
{
    String lionName;
    String lionLook;
    String lionSound;
    public Lion(String lionName, String lionLook, String lionSound)
    {
        this.lionName = lionName;
        this.lionLook = lionLook;
        this.lionSound = lionSound;
    }
    public String sound() {
        return lionSound;
    }
    public String look() {
        return lionLook;
    }
    public String name() {
        return lionName;
    }
    public String kind() {
        return "lion";
    }
    
}