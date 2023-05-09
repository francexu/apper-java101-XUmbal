package Zoo;

public class Animal {
    // Animal has name, type, and kind of food
    public String animalName;
    public String type;
    public String kindOfFood;
    public String sound;

    // Animal produces own sound
    public void produceSound() {
        System.out.println(sound);
    }

    // Animal chews food
    public void chewing() {
        System.out.println(animalName + " is chewing " + kindOfFood);
    }

    // test
//    public static void main(String[] args) {
//        Animal dog = new Animal();
//        dog.animalName = "dog";
//        dog.kindOfFood = "bone";
//        dog.sound = "arf";
//
//        dog.produceSound();
//        dog.chewing();
//    }
}
