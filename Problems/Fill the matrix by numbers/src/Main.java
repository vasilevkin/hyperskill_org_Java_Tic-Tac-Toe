import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                matrix[i][k] = Math.abs(i - k);
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
        // put your code here
    }
}
