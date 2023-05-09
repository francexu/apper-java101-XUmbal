package Zoo.People;

import Zoo.Animal;
import Zoo.Visitors;

public class Employees {
    public String employeeName;
    int employeeSalary; // accessible only to managers

    public void feedAnimals() {
        Animal assignedAnimal = new Animal();
        assignedAnimal.animalName = "cat";

        System.out.println("feeding " + assignedAnimal.animalName);
    }

    // accessible only to managers
    void getSalary() {
        System.out.println(employeeSalary);
    }

    // test
//    public static void main(String[] args) {
//        Visitors visitor = new Visitors();
//        visitor.setAge(25);
//        visitor.getAge();
//    }
}
