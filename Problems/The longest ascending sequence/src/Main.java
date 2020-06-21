import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int sequenceLength = 1;
        int maxLength = 1;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int k = 1; k < size; k++) {
            if (numbers[k - 1] < numbers[k]) {
                sequenceLength++;
            } else {
                if (sequenceLength > maxLength) {
                    maxLength = sequenceLength;
                }
                sequenceLength = 1;
            }
        }

        if (sequenceLength > maxLength) {
            maxLength = sequenceLength;
        }

        System.out.println(maxLength);
        // put your code here
    }
}
