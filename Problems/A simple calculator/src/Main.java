import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n1 = scanner.nextLong();
        String operator = scanner.next();
        long n2 = scanner.nextLong();
        String output = "Unknown operator";

        switch (operator) {
            case "+":
                output = String.valueOf(n1 + n2);
                break;
            case "-":
                output = String.valueOf(n1 - n2);
                break;
            case "/":
                output = n2 == 0
                        ? "Division by 0!"
                        : String.valueOf(n1 / n2);
                break;
            case "*":
                output = String.valueOf(n1 * n2);
                break;
            default:
                output = "Unknown operator";
        }

        System.out.println(output);
        // put your code here
    }
}
