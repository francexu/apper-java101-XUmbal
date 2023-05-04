public class OddEven {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};

        countOddEven(nums);
    }

    public static void countOddEven(int[] numsArray) {
        // Set initial value of odd and even count
        int evenCount = 0;
        int oddCount = 0;

        // iterate through the given array
        for (int i = 0; i < numsArray.length; i++) {
            // detect if number is even else odd
            if (numsArray[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Odd: " + oddCount);
        System.out.println("Even: " + evenCount);
    }
}
