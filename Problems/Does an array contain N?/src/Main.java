import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] elements = new int[size];

        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();
        boolean contains = false;

        for (int element : elements) {
            if (number == element) {
                contains = true;
            }
        }

        System.out.println(contains);
        // put your code here
    }
}
