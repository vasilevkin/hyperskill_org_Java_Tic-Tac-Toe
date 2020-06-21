import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        boolean order = false;

        for (int k = 1; k < strings.length; k++) {
            int compare = strings[k - 1].compareTo(strings[k]);
            if (compare <= 0) {
                order = true;
            } else {
                order = false;
            }
        }

        System.out.println(order);
        // put your code here
    }
}
