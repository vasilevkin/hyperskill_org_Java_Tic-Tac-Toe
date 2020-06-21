import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static int[] get3ElementArray(Scanner scanner) {
        int[] box = new int[3];

        for (int i = 0; i < 3; i++) {
            box[i] = scanner.nextInt();
        }

        return box;
    }

    public static void main(String[] args) {
        int[] box1 = get3ElementArray(scanner);
        int[] box2 = get3ElementArray(scanner);
        String compareResult = "Incomparable";

        Arrays.sort(box1);
        Arrays.sort(box2);

        if (box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]) {
            compareResult = "Box 1 = Box 2";
        } else if (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) {
            compareResult = "Box 1 > Box 2";
        } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
            compareResult = "Box 1 < Box 2";
        }

        System.out.println(compareResult);
        // write your code here
    }
}
