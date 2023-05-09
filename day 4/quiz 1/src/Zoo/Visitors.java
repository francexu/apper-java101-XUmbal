package Zoo;

import Zoo.People.Employees;

public class Visitors {
    public String visitorName;
    private int visitorAge; // only accessible to this class but can be retrieved using setAge() and getAge() methods

    public void getAge() {
        System.out.println(visitorAge);
    };

    public void setAge(int age) {
        visitorAge = age;
    }

    // test
//    public static void main(String[] args) {
//        Employees employee = new Employees();
//        employee.employeeSalary = 1000;
//    }
}
