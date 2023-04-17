/*
 * Activity 4.9.2
 */
public class Hooved extends Animal
{

  public Hooved(String food, boolean nocturnal, double aveLifeSpan){
    super(food, nocturnal, aveLifeSpan);
    System.out.println("An hoofer has arrived!!!!!");
    voice = "<various clacking noises>";
  }

  public Hooved(){
    System.out.println("An hoofer has arrived!!!!!");
    voice = "<various clacking noises>";
  }

  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}