public class Feline extends Animal {

    public Feline(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A felon has arrived!!!!!");
        voice = "growl";
    }

    public Feline() {
        System.out.println("A felon has arrived!!!!!");
        voice = "growl";
    }

    public void growl() {
        System.out.println("The feline growls.");
    }
    public void roar() {
        System.out.println("The feline roars.");
    }
}
