public class PrimeNumberV2 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println(isPrimeNumber(97));

        long endTime = System.nanoTime();
        System.out.println("Duration: " + (endTime - startTime));
    }

    public static boolean isPrimeNumber(int num) {
        // check if number is less than one or divisible by 2
        if (num <= 1 || (num > 2 && num % 2 == 0)) {
            return false;
        }

        // check if number is equal to 2
        if (num == 2) {
            return true;
        }

        // check if number is divisible by other numbers that are not less than one or divisible by 2
        for (int i = 3; i < (Math.sqrt(num) + 1); i+=2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
