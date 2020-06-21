import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String output = "You have chosen a ";

        switch (number) {
            case 1:
                output += "square";
                break;
            case 2:
                output += "circle";
                break;
            case 3:
                output += "triangle";
                break;
            case 4:
                output += "rhombus";
                break;
            default:
                output = "There is no such shape!";
        }

        System.out.println(output);
        // put your code here
    }
}
