// write your answer here 

import java.util.Scanner;

class Task {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String output = "";

    for (int i = 0; i <= input.length(); i++) {
      if (input.length() == 0) break;
      if (input.length() == 1) {
          output += input + "1";
      }


    }

    System.out.println(output);
    // put your code here
  }
}
