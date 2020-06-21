import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[] income = new double[size];
        double[] tax = new double[size];
        int companyIndex = 1;

        for (int i = 0; i < size; i++) {
            income[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            tax[i] = scanner.nextInt();
        }

        for (int k = 1; k < size; k++) {
            double prevTax = income[k - 1] * tax[k - 1] / 100;
            double thisTax = income[k] * tax[k] / 100;
            if (prevTax < thisTax) {
                companyIndex = k + 1;
            }
        }

        System.out.println(companyIndex);
        // write your code here
    }
}
