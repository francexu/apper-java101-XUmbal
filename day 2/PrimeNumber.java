class PrimeNumber {
    public static void main(String[] args) {
        // call the isPrimeNumberMethod
        if (isPrimeNumber(4)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static boolean isPrimeNumber(int num) {
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