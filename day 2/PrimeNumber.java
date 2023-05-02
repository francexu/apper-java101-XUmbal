class PrimeNumber {
    public static void main(String[] args) {
        // call the isPrimeNumberMethod
        System.out.println(isPrimeNumber(60));
    }

    public static boolean isPrimeNumber(int num) {
        // check if number is less than or equal to 1
        if (num <= 1) {
            return false;
        } 

        // check if number is divisible by other numbers 
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}