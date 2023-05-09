package zooscratch;

import zooscratch.people.Manager;

public class ZooApp {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Manager 1");
        manager1.setAge(25);
        manager1.setName("Xenia");

        System.out.println(manager1.getName());
    }
}
