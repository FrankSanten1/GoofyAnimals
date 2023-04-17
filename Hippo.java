/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved
{

  public Hippo(String food, boolean nocturnal, double aveLifeSpan){
    super(food, nocturnal, aveLifeSpan);
    System.out.println("An hippun has arrived!!!!!");
    voice = "groan";
  }

  public void groan()
  {
    System.out.println("The hippo groans.");
  }
}