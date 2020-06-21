import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = "not a valid house";

        switch (input) {
            case "gryffindor":
                result = "bravery";
                break;
            case "hufflepuff":
                result = "loyalty";
                break;
            case "slytherin":
                result = "cunning";
                break;
            case "ravenclaw":
                result = "intellect";
                break;
            default:
        }

        System.out.println(result);
        // put your code here
    }
}
