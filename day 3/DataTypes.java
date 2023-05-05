public class DataTypes {

    // Zero value

    static int age;
    static double salary;
    static boolean isHappy;
    static char favoriteLetter;
    static Integer wrapperAge;
    static Boolean wrapperIsHappy;

    public static void main(String[] args) {
        System.out.println(age); // 0
        System.out.println(salary); // 0.0
        System.out.println(isHappy); // false
        System.out.println(favoriteLetter); // null

        // wrapper - default value is null (makes more sense since 0 is still a value)
        // in java, objects lang may null value
        System.out.println(age + " " + wrapperAge); // 0 null
        System.out.println(isHappy + " " + wrapperIsHappy); // false null
        // System.out.println((wrapperAge + 10)); will return an error

        Integer theAge = 23;
        displayWrapperAge(theAge);

        System.out.println("-----------");

        // pass by reference
        Integer[] ages = new Integer[]{100};
        System.out.println(ages[0]);
        displayWrapperAgeReference(ages);

        // convert primitive to wrapper
        int numUsers = 100;
        Integer numberOfUsers = numUsers;

        // wrapper to primitive
        System.out.println(numberOfUsers.intValue());

        System.out.println("-----------");
        int a = 9, b = 10, c = 78;
        // follows pemdas
        System.out.println(a + b * c);

        // modulo precedence - same as multi/division whichever comes first
        System.out.println((a + b) * c % 4); // (19 * 78) % 4

        System.out.println(c++ + " " + ++a); // 78, 10 c++ di pa nag-add ng changes
        System.out.println(c); // ngayon palang magrereflect yung change

        System.out.println(b++ + " " + ++b);
        System.out.println(b); //12
    }

    public static void displayWrapperAge(Integer age) {
        System.out.println(age);
        age = age + 100;
        System.out.println(age);
    }

    public static void displayWrapperAgeReference(Integer[] age) {
        // System.out.println(age[0]);
        age[0] = age[0] + 100;
        System.out.println(age[0]);
    }
}
