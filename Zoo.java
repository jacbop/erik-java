
/**
 * Write a description of class Zoo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zoo
{
    Animal[] animals;

    /**
     * Constructor for objects of class Zoo
     */
    public Zoo()
    {
        ZooStorage zooStorage = new ZooStorage();
        //zooStorage.save("Sally"); 
        String data = zooStorage.load();
        System.out.println(data);
        Dog alex = new Dog("alex", "german pointer speckled with brown spots", "ruff! ruff!");
        Dog lucy = new Dog("lucy", "poodle with curly white fur and a pink collar", "arff! arff!");
        Dog max = new Dog("max", "black and tan dobermann with sharp teeth", "woof! woof!");
        Lion leo = new Lion("leo", "proud lion who displays you his beautiful amber colored mane", "ROARR!!!");
        Lion leona = new Lion("leona", "female lion who is sleeping on a large jagged rock", "Grrrrr!");
        Monkey mike = new Monkey("mike", "gibbon who swings from vines dangling from his enclosure", "Oooh! Oooh!");
        Monkey michelle = new Monkey("michelle", "capuchin who is picking flies from her fur and eating them", "Ahh! Ahh!");
        this.animals = new Animal[] {alex, lucy, max, leona, leo, mike, michelle};
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Animal[] getListAnimals()
    {

        return animals;
    }
}
