import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        boolean contains = true;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 1; i < size; i++) {
            if ((numbers[i] == n && numbers[i - 1] == m) ||
                    (numbers[i] == m && numbers[i - 1] == n)) {
                contains = false;
            }
        }

        System.out.println(contains);
        // put your code here
    }
}
