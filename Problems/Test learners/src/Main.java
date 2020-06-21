import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "Unknown number";
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                result = "Yes!";
                break;
            case 2:
            case 3:
            case 4:
                result = "No!";
                break;
            default:
        }

        System.out.println(result);
        // put your code here
    }
}
