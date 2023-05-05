public class SwitchStatements {
    public static void main(String[] args) {
        // sound of animals
        Animal animal = Animal.DOG;
        animalSound(String.valueOf(animal).toLowerCase());
    }

    public static void animalSound(String animal) {
        switch (animal) {
            case "dog":
                System.out.println("arf arf");
                break; // to stop execution of switch statement otherwise, it will execute the next statements until a break is found
            case "cat":
                System.out.println("meow");
                break;
            case "goat":
                System.out.println("meeeehhh");
                break;
            case "cow":
                System.out.println("mooo");
                break;
            default:
                System.out.println("Yehey!");
        }
    }

    // in code practice, usually separate na class yung enum
    public enum Animal {
        DOG, CAT, GOAT, COW
    }
}
