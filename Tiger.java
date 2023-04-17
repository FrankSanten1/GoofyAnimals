public class Tiger extends Feline {

    public Tiger(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An tigr has arrived!!!!!");
        voice = "growl";
    }

    public Tiger(){
        System.out.println("An tigr has arrived!!!!!");
        voice = "growl";
    }

    public void swim() {
        System.out.println("The tiger swims.");
    }
    public void huntAlone() {
        System.out.println("The tiger hunts alone.");
    }
}
