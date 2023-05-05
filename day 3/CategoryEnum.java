public class CategoryEnum {

    // 1. Create an enum Category with the following values: MEN, WOMEN, KID, GRANDMA, GRANPA.
    public enum Category {
        MEN, WOMEN, KID, GRANDMA, GRANDPA
    }

    public static void main(String[] args) {
        // 2. Create a variable chosenCategory with a value from Category.
        Category chosenCategory = Category.GRANDMA;

        // 3. Implement a switch...case statement which dictates the value of price
        switch (chosenCategory) {
            case MEN:
                System.out.println(13.57);
                break;
            case WOMEN:
                System.out.println(20.45);
                break;
            case KID:
                System.out.println(45.6);
                break;
            case GRANDMA:
                System.out.println(56.67);
                break;
            case GRANDPA:
                System.out.println(3.56);
                break;
        }
    }
}
