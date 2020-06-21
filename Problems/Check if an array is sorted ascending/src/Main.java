import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        boolean ascending = true;

        for (int s = 0; s < size; s++) {
            numbers[s] = scanner.nextInt();
        }

        for (int k = 1; k < size; k++) {
            if (numbers[k - 1] > numbers[k]) {
                ascending = false;
                break;
            }
        }

        System.out.println(ascending);
        // put your code here
    }
}
