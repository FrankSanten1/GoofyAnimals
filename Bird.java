public class Bird extends Animal {

    public Bird(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An birb has arrived!!!!!");
        voice = "sing";
    }
    public Bird(){
        System.out.println("An birb has arrived!!!!!");
        voice = "sing";
    }

    public void fly() {
        System.out.println("The bird flies.");
    }
}
