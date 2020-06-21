import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String output = "error!";

        switch (number) {
            case 0:
                output = "do not move";
                break;
            case 1:
                output = "move up";
                break;
            case 2:
                output = "move down";
                break;
            case 3:
                output = "move left";
                break;
            case 4:
                output = "move right";
                break;
            default:
                output = "error!";
        }

        System.out.println(output);
        // put your code here
    }
}
