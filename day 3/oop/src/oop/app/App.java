package oop.app;

import oop.app.blueprint.Person;

public class App {
    public static void main(String[] args) {
        // to instantiate an object;
        Person mark = new Person();
        mark.age = 19;
        mark.name = "Mark Kram";
        mark.isMale = true;
        mark.relationshipStatus = "single";

        System.out.println(mark.getNameInPrefix());
        mark.getJob();
    }
}
