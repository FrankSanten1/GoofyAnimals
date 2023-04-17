public class Elephant extends Animal {

    public Elephant(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An elephont has arrived!!!!!");
        voice = "trumpet";
    }

    public Elephant(){
        System.out.println("An elephont has arrived!!!!!");
        voice = "trumpet";
    }

    public void trumpet() {
        System.out.println("The elephant trumpets.");
    }
    public void forage() {
        System.out.println("The elephant forages extra hard.");
    }

    public String toString()
    {
    return "This is an object of the Elephant class.";
    }
}
