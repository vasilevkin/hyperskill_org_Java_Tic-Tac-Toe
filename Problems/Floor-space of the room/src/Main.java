import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();
        double result = 0;

        String input = "";

        while (scanner.hasNext()) {
            input += scanner.next() + " ";
        }

        System.out.println(input);
//        switch (shape) {
//            case "triangle":
//                double a = scanner.nextDouble();
//                double b = scanner.nextDouble();
//                double c = scanner.nextDouble();
//                double halfPerimeter = (a + b + c) / 2;
//                result = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
//                break;
//            case "rectangle":
//                a = scanner.nextDouble();
//                b = scanner.nextDouble();
//                result = a * b;
//            case "circle":
//                double r = Double.parseDouble(scanner.nextLine());
//                result = 3.14 * r * r;
//            default:
//        }
//
//        System.out.println(result);
//        // put your code here
    }
}
