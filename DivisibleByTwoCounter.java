public class DivisibleByTwoCounter {
    public static void main(String[] args) {
        int count = 0;
        int number = 200;

        do {
            if (number % 2 == 0) {
                number /= 2;
                count++;
            } else {
                break;
            }
        } while (true);

        System.out.println("The number of times 200 is divisible by 2 is: " + count);
    }
}
