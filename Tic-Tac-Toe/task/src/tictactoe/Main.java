package tictactoe;

import java.util.Scanner;

public class Main {
    public static int size = 3;
    public static char x = 'X';
    public static char o = 'O';
    public static char empty = ' ';
    public static Board field;

    public static String scanInput() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static boolean checkBoard() {
        boolean isFinished = false;
        String result = "";

        if (field.checkForPlayer(x)) {
            result = "X wins";
        } else if (field.checkForPlayer(o)) {
            result = "O wins";
        } else if (field.checkForDraw()) {
            result = "Draw";
        }

        if (!(result.isEmpty())) {
            System.out.println(result);
            isFinished = true;
        }

        return isFinished;
    }

    private static Coordinate parseUserInput(String input) throws Exception {
        char[] chars = input.toCharArray();
        int x;
        int y;

        if (Character.isDigit(chars[0]) && Character.isDigit(chars[2])) {
            x = Integer.parseInt(String.valueOf(chars[0]));
            y = Integer.parseInt(String.valueOf(chars[2]));
        } else {
            throw new Exception("You should enter numbers!");
        }

        if (!(x > 0 && x < 4 && y > 0 && y < 4)) {
            throw new Exception("Coordinates should be from 1 to 3!");
        }

        if (field.getSymbolForCoordinate(new Coordinate(x, y)) != empty) {
            throw new Exception("This cell is occupied! Choose another one!");
        }

        return new Coordinate(x, y);
    }

    public static void main(String[] args) {
        String input;
        Coordinate fromUser = new Coordinate(1, 1);
        boolean xTurn = true;

        field = new Board("         ");

        field.printBoard();

        do {
            try {
                System.out.print("Enter the coordinates: ");

                input = scanInput();
                fromUser = parseUserInput(input);

                if (xTurn) {
                    field.setSymbolToCoordinate(x, fromUser);
                    xTurn = false;
                } else {
                    field.setSymbolToCoordinate(o, fromUser);
                    xTurn = true;
                }

                field.printBoard();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }

        } while (!checkBoard());
    }
}

class Board {
    /*  Coordinates          (x,y)
            (1,3)(2,3)(3,3)  line3 [0,1,2]
            (1,2)(2,2)(3,2)  line2 [0,1,2]
            (1,1)(2,1)(3,1)  line1 [0,1,2] */

    private char[] line3 = new char[3];
    private char[] line2 = new char[3];
    private char[] line1 = new char[3];

    private final char x = 'X';
    private final char o = 'O';
    private final char empty = ' ';

    Board(String input) {
        char[] inputArray = input.toCharArray();

        line3[0] = inputArray[0];
        line3[1] = inputArray[1];
        line3[2] = inputArray[2];
        line2[0] = inputArray[3];
        line2[1] = inputArray[4];
        line2[2] = inputArray[5];
        line1[0] = inputArray[6];
        line1[1] = inputArray[7];
        line1[2] = inputArray[8];
    }

    public char getSymbolForCoordinate(Coordinate coordinate) {
        int x = coordinate.x;
        int y = coordinate.y;
        char symbol = '_';

        if (y == 1) {
            symbol = line1[x - 1];
        } else if (y == 2) {
            symbol = line2[x - 1];
        } else if (y == 3) {
            symbol = line3[x - 1];
        }

        return symbol;
    }

    public void setSymbolToCoordinate(char symbol, Coordinate coordinate) {
        int x = coordinate.x;
        int y = coordinate.y;

        if (y == 1) {
            line1[x - 1] = symbol;
        } else if (y == 2) {
            line2[x - 1] = symbol;
        } else if (y == 3) {
            line3[x - 1] = symbol;
        }
    }

    public void printBoard() {
        System.out.println("---------");
        System.out.println("| " + line3[0] + " " + line3[1] + " " + line3[2] + " |");
        System.out.println("| " + line2[0] + " " + line2[1] + " " + line2[2] + " |");
        System.out.println("| " + line1[0] + " " + line1[1] + " " + line1[2] + " |");
        System.out.println("---------");
    }

    public boolean checkForDraw() {
        boolean draw = true;
        for (int i = 0; i < 3; i++) {
            if ((line1[i] == empty) || (line2[i] == empty) || (line3[i] == empty)) {
                draw = false;
                break;
            }
        }

        return draw;
    }

    public boolean checkForPlayer(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (line1[i] == symbol && line2[i] == symbol && line3[i] == symbol) {
                return true;
            }
        }

        if (line1[0] == symbol && line1[1] == symbol && line1[2] == symbol) {
            return true;
        }

        if (line2[0] == symbol && line2[1] == symbol && line2[2] == symbol) {
            return true;
        }

        if (line3[0] == symbol && line3[1] == symbol && line3[2] == symbol) {
            return true;
        }

        if (line1[0] == symbol && line2[1] == symbol && line3[2] == symbol
        ) {
            return true;
        }

        if (line1[2] == symbol && line2[1] == symbol && line3[0] == symbol
        ) {
            return true;
        }

        return false;
    }
}

class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
