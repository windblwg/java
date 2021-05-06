package ru.geekbrains;

import java.util.Random;
import static java.lang.System.*;
import java.util.Scanner;

public class MainApp {
    private static char[][] map;
    private static final int SIZE = 3;
    private static final char DOT_EMPTY = '*';
    private static final char DOT_X = 'X';
    private static final char DOT_O = '0';
    public static Random rand = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static int i, j, x, y, z, count = 0;
    public static boolean bool = true;

    public static void main(String[] args) {
        initMap();
        printMap();
        while (bool) {
            bool = doGame(z);
            z++;
        }
        System.out.println("== GAME OVER ==");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean doGame(int i) {
        char DOT = '_';
        int a = i % 2;
        switch (a) {
            case 0:
                playerTurn();
                DOT = 'X';
                break;
            case 1:
                botTurn();
                DOT = '0';
                break;
        }
        printMap();
        if (i >= 4) {
            if (checkWin(DOT)) {
                System.out.println(DOT);
                System.out.println(DOT + " - WIN !! ");
                return false;
            } else if (isMapFull()) {
                System.out.println(" No one win ");
                return false;
            }
        }
        return true;
    }

    public static void botTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellValid(x, y));
        System.out.println(" Бот ходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void playerTurn() {
        do {
            System.out.println("Введите координаты (x,y) : ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        return (x < 0 || x >= SIZE || y < 0 || y >= SIZE || map[y][x] == DOT_X || map[y][x] == DOT_O);
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean checkWin(char symb) {
        int countR=0,countC=0,countD1=0,countD2=0;
        System.out.println("symb " + symb);

        for (i = 0; i<SIZE ; i++)
            if (map[i][0] == symb) countR++;

        for (i = 0; i<SIZE ; i++)
            if (map[0][i] == symb) countC++;

        for (i = 0; i<SIZE ; i++)
            if (map[i][i] == symb) countD1++;

        for (i = 0; i<SIZE ; i++)
            if (map[i][SIZE-i -1] == symb) countD2++;

        return (countR==3||countC==3||countD1==3||countD2==3);
    }
}
