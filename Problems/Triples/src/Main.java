import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int triples = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int k = 2; k < size; k++) {
            int prevPrev = numbers[k - 2] + 2;
            int prev = numbers[k - 1] + 1;
            int number = numbers[k];

            if ((prevPrev == number) && (prev == number)) {
                triples++;
            }
        }

        System.out.println(triples);
        // put your code here
    }
}
