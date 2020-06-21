import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.println(line2);
        System.out.println(line1);

//        final Scanner scanner1 = new Scanner(System.in); // 1
//        final int a;                                    // 2
//        final int b = scanner1.nextInt() + a;            // 3
//        final int c = 0;                                // 4
//        c = b;                                          // 5
//        System.out.println(c + 1);
    }
}
