package zooscratch.people;

import zooscratch.Animal;

// to inherit from human class
public class Employee extends Human {
    double salary;

    void feedAnimal(Animal animal) {
        animal.chewFood();
    }

    double getSalary() {
        return salary;
    }
}
