package repo_java1_Home_Work.lesson3;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static char [][] field;
    private static int fieldSizeY;
    private static int fieldSizeX;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    // check  Draw
    //check win

    private static void initField(){
        fieldSizeX = 3;
        fieldSizeY = 3;
        field= new char [fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField(){
        System.out.print("+");

        for (int x = 0; x < fieldSizeX * 2 + 1; x++)
            System.out.print(( x % 2 == 0) ? "-" : x / 2 + 1);
        System.out.println();

        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print(y + 1 + "|");
            for (int x = 0; x < fieldSizeX; x++)
                System.out.print(field[y][x] + "|");
            System.out.println();
        }

        for (int x = 0; x <= fieldSizeX * 2 + 1; x++)
            System.out.print("-");
        System.out.println();
    }

    private static void humanTurn(){
        int x;
        int y;
        do {
            System.out.println("Введите координаты кода X и Y (от 1 до 3) через пробел ->");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
         } while (!isValidCell(x,y) || !isEmptyCell(x, y));
            field[y][x] = DOT_HUMAN;

    }

    private static boolean isEmptyCell (int x, int y){
        return field[y][x] == DOT_EMPTY;
    }

    private static boolean isValidCell (int x, int y){
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static void aiTurn(){
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;

    }

    private static boolean checkDraw(){
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if(isEmptyCell(x,y)) return false;
            }
        } return true;
    }

    private static boolean checkWin(char c) {
        char a = 0, b = 0,d = 0, i = 0, j = 0, e = 0, k = 0, r = 0, h = 0, g = 0;

        // hor
//        if (field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
//        if (field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
//        if (field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;
//
//        // ver
//        if (field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//        if (field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//        if (field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;

        // dia
//        if (field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//        if (field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;

        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field.length; x++) {
                int l = field.length - 1;
                a = field[y][y];
                e = field[x][x];
                b = field[y][x];
                d = field[x][y];
                i = field[x][l];
                j = field[x][l - x];
                k = field[l - x][x];
                r = field[y][l];
                h = field[y][l - y];
                g = field[l - y][y];

                if (c == e && c == k && c == i || c == e && c == d && c == i || c == a && c == e && c == r) // и так далее
                    return true;
            }
        }
            return false;
    }

    public static void main(String[] args) {
        String answer;
        do {
            initField();
            printField();
            while (true) {
                humanTurn();
                if (checkEndGame(DOT_HUMAN, "Human Win")) break;
                aiTurn();
                if (checkEndGame(DOT_AI, "Computer Win")) break;
            }
            System.out.println("Wanna play again? y / n ->");
            answer = SCANNER.next();
        } while (answer.equals("y"));
        SCANNER.close();
    }

    private static boolean checkEndGame(char dot, String winMessage) {
        printField();
        if (checkWin(dot)) {
            System.out.println(winMessage);
            return true;
        }
        if (checkDraw()) {
            System.out.println("Draw");
            return true;
        }
        return false;
    }
}