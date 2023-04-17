public class Owl extends Bird {

    public Owl(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An ol has arrived!!!!!");
        voice = "hoot";
    }

    public Owl(){
        System.out.println("An ol has arrived!!!!!");
        voice = "hoot";
    }

    public void hunt() {
        System.out.println("The owl hunts.");
    }
}
