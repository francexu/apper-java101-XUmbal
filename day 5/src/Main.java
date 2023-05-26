import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> restaurants = new HashMap<>();
        restaurants.put("r1","Jollibee");
        restaurants.put("r2","Mcdo");
        restaurants.put("r3","Chowking");
        restaurants.put("r4","Greenwich");
        restaurants.put("r5","Mang Inasal");

        System.out.println(restaurants.get("r1"));
        System.out.println(restaurants.size());
        System.out.println(restaurants.keySet());
        System.out.println(restaurants.containsKey("r3"));
        System.out.println(restaurants.containsValue("Greenwich")); // for quick checking
        System.out.println(restaurants.values());

        // to have a double as an input
        Scanner scanner = new Scanner(System.in);
        String nextDouble = scanner.next();
        System.out.println(Double.valueOf(nextDouble));
    }
}