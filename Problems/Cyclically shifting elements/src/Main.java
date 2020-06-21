import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int[] newNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int k = 1; k < size; k++) {
            newNumbers[k] = numbers[k - 1];
        }

        newNumbers[0] = numbers[size - 1];

        for (int number : newNumbers) {
            System.out.print(number + " ");
        }
        // put your code here
    }
}
