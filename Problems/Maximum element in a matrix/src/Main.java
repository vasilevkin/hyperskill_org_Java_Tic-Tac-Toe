import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int maxN = 0;
        int maxM = 0;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                matrix[i][k] = scanner.nextInt();
            }
        }

        if (m == 1) {
            for (int i = 1; i < n; i++) {
                if (matrix[i - 1][0] < matrix[i][0]) {
                    if (matrix[i][0] > matrix[maxN][maxM]) {
                        maxN = i;
                        maxM = 0;
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int k = 1; k < m; k++) {
                    if (matrix[i][k - 1] < matrix[i][k]) {
                        if (matrix[i][k] > matrix[maxN][maxM]) {
                            maxN = i;
                            maxM = k;
                        }
                    }
                }
            }
        }

        System.out.println(maxN + " " + maxM);
        // put your code here
    }
}
