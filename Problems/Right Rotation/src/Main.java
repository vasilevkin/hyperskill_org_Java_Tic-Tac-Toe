import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int rotation = scanner.nextInt();
        int rotateTimes = rotation % numbers.length;

        for (int m = 0; m < rotateTimes; m++) {
            String[] newNumbers = new String[numbers.length];

            for (int k = 1; k < numbers.length; k++) {
                newNumbers[k] = numbers[k - 1];
            }

            newNumbers[0] = numbers[numbers.length - 1];
            numbers = newNumbers;
        }

        for (String number : numbers) {
            System.out.print(number + " ");
        }
        // put your code here
    }
}
