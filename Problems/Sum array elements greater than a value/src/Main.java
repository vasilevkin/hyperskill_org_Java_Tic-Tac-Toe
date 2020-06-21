import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        for (int number : numbers) {
            if (number > n) sum += number;
        }

        System.out.println(sum);
        // put your code here
    }
}