import java.util.*;

public class Main {
    public static void printNo() {
        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = n * n;
        int[][] sudoku = new int[n2][n2];

        for (int i = 0; i < n2; i++) {
            for (int k = 0; k < n2; k++) {
                sudoku[i][k] = scanner.nextInt();
            }
        }

        if (n == 1 && sudoku[0][0] != n) {
            printNo();
            return;
        }

        for (int i = 0; i < n2; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int s = 0; s < n2; s++) {
                set.add(sudoku[i][s]);
            }
            if (set.size() != n2) {
                printNo();
                return;
            }
        }

        for (int s = 0; s < n2; s++) {
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n2; i++) {
                set.add(sudoku[i][s]);
            }
            if (set.size() != n2) {
                printNo();
                return;
            }
        }

        for (int t = 0; t < n; t++) {
            for (int k = 0; k < n; k++) {
                HashSet<Integer> smallSet = new HashSet<>();

                for (int i = t * n; i < t * n + n; i++) {
                    for (int s = k * n; s < k * n + n; s++) {
                        smallSet.add(sudoku[i][s]);
                    }
                }
                if (smallSet.size() != n2) {
                    printNo();
                    return;
                }
            }
        }
        System.out.println("YES");
        // write your code here
    }
}
