import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 4;
        char[][] pattern = new char[size][size];
        boolean pretty = true;

        for (int i = 0; i < size; i++) {
            char[] row = scanner.nextLine().toCharArray();
            System.arraycopy(row, 0, pattern[i], 0, size);
        }

        for (int s = 1; s < size; s++) {
            for (int k = 1; k < size; k++) {
                if (pattern[s][k] == pattern[s - 1][k - 1] &&
                        pattern[s][k] == pattern[s][k - 1] &&
                        pattern[s][k] == pattern[s - 1][k]) {
                    pretty = false;
                    break;
                }
            }
        }

        if (pretty) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        // write your code here
    }
}
