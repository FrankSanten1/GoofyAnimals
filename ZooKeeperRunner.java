/*
 * Activity 4.9.2
 */

import java.util.ArrayList;
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Elephant elephant = new Elephant("leaves, grass, roots", false, 60.0);
    elephant.trumpet();

    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();
    tiger.growl();
    tiger.isNocturnal();

    elephant.eat();
    elephant.getLifeSpan();

    Gorilla gorilla = new Gorilla();

    Hippo hippo = new Hippo("stuff idk", true, 999.9);
    hippo.eat();

    Penguin penguin = new Penguin();
    penguin.fish();
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();

    ArrayList<Animal> funnyListThing = new ArrayList<Animal>();
    funnyListThing.add(elephant);
    funnyListThing.add(tiger);
    funnyListThing.add(hippo);
    funnyListThing.add(gorilla);
    funnyListThing.add(penguin);
    funnyListThing.add(owl);
    funnyListThing.add(owl2);

    for (Animal theGuy : funnyListThing) {
      System.out.println(theGuy.speak());
    }

    Animal[] theOtherFunnyList = {elephant, tiger, hippo, gorilla, penguin, owl, owl2};

    for (Animal theOtherGuy : theOtherFunnyList) {
      System.out.println(theOtherGuy.speak());
    }

    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
    a.isNocturnal();
    //a.trumpet();
    // ^^^ not in animal class, so it doesn't work

    Animal a1 = new Animal();
    a1.eat();
    Object a2 = new Animal();
    //a2.eat();
    // ^^ not a method in object class

    System.out.println(a2.toString());
    System.out.println(a.toString());
    Animal a3 = new Animal();
    System.out.println(a3.toString());

    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(a4.toString());

    Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(o2.toString());

    Object o3 = new Gorilla();
    System.out.println(o3);

  }
}