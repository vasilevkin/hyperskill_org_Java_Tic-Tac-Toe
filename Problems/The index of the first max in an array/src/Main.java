import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int maxIndex = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        maxNumber = numbers[maxIndex];

        for (int h = 1; h < size; h++) {
            if (numbers[h - 1] < numbers[h]) {
                if (numbers[h] > maxNumber) {
                    maxIndex = h;
                    maxNumber = numbers[h];
                }
            }
        }

        System.out.println(maxIndex);
        // put your code here
    }
}
