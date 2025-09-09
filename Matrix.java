package ru.netology;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static final int SIZE = 8;


    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {               // 1. Создание массива случайных чисел
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        printMatrix(colors);                   // 2. Отображение исходного массива
        System.out.println("Выберите угол поворота: \n1. 90 градусов \n2. 180 градусов \n3. 270 градусов");
        Scanner sc = new Scanner(System.in);
        int rotation = sc.nextInt();               // 3. Запрос угла у пользователя
        int[][] result = rotateMatrix(colors, rotation);        // 4. создание нового массива и заполнение его данными исходного массива в зависимости от заданного угла
        printMatrix(result);                              // 5. Отобразить получившийся массив
    }


    public static int[][] rotateMatrix(int[][] colors, int rotation) {

        int[][] rotatedColors = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (rotation) {
                    case 1:
                        rotatedColors[i][j] = colors[SIZE - 1 - j][i];
                        break;
                    case 2:
                        rotatedColors[i][j] = colors[SIZE - 1 - i][SIZE - 1 - j];
                        break;
                    case 3:
                        rotatedColors[i][j] = colors[j][SIZE - 1 - i];
                        break;
                    default:
                        rotatedColors[i][j] = colors[i][j];
                }
            }
        }
        return rotatedColors;
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
