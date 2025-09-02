import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static final int SIZE = 8;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        int[][] rotatedColors = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        printMatrix(colors);
        System.out.println("Выберите угол поворота: \n1. 90 градусов \n2. 180 градусов \n3. 270 градусов");
        int rotation = sc.nextInt();
        if (rotation == 3) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[j][SIZE - 1 - i];
                    System.out.format("%4d", rotatedColors[i][j]);
                }
                System.out.println();
            }
        } else if (rotation == 2) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[SIZE - 1 - i][SIZE - 1 - j];
                    System.out.format("%4d", rotatedColors[i][j]);
                }
                System.out.println();
            }
        } else if (rotation == 1) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[SIZE - 1 - j][i];
                    System.out.format("%4d", rotatedColors[i][j]);
                }
                System.out.println();
            }
        } else System.out.println("Такого варианта нет!");

    }

    public static void printMatrix(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
