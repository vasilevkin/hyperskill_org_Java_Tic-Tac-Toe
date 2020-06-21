import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int number : numbers) {
            if (number < minValue) minValue = number;
        }

        System.out.println(minValue);
        // put your code here
    }
}
