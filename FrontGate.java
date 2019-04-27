

public class FrontGate
{
  public static void main(String[] args) {
   System.out.println("You have entered the zoo!");

   Zoo zoo = new Zoo();
   Animal[] animals = zoo.getListAnimals();
   for (Animal animal : animals){
    System.out.println("The " + animal.kind() + " is named " + animal.name() 
    + ". It says " + animal.sound() + ". It is a " + animal.look());
    }

}
}
