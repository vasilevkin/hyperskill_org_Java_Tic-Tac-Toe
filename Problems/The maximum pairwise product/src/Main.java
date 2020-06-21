import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int maxProduct = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int k = 1; k < size; k++) {
            int product = numbers[k - 1] * numbers[k];
            if (product > maxProduct) maxProduct = product;
        }

        System.out.println(maxProduct);
        // put your code here
    }
}
