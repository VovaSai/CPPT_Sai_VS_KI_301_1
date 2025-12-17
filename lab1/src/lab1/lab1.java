package lab1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Клас lab1 реалізує лабораторну роботу №1
 */
public class lab1 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args аргументи
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть розмір матриці: ");
        int row = sc.nextInt();

        System.out.println("Введіть символ заповнювач: ");
        String symbol = sc.next();

        if (symbol.length() != 1) {
            System.out.println("Введіть коректний символ заповнювач");
            return;
        }

        String[][] arr = createLengthOfEachSubArr(row);
        String fileName = "result.txt";

        try {
            printMatrix(arr, symbol, row, fileName);
        } catch (IOException e) {
            // Обробка помилки під час запису в файл
            throw new RuntimeException("Сталася помилка під час запису в файл: " + e.getMessage());
        }
    }

    /**
     * Метод який генерує зубчастий масив (виводить в консоль і записує в файл)
     *
     * @param arr    масив для заповнення
     * @param symbol символ заповнювач
     * @param row    розмір масиву
     * @param file   назва файлу
     * @throws IOException якщо столась якась помилка при запису в файл
     */
    public static void printMatrix(String[][] arr, String symbol, int row, String file) throws IOException {
        System.out.println("Результат матриці: ");

        try (FileWriter writer = new FileWriter(file)) {

            int mid = row / 2;

            for (int i = 0; i < row; i++) {
                int indexJ = 0;

                for (int j = 0; j < row; j++) {
                    if ((i + j < mid) || (j - i > mid) || (i - j > mid) || (i + j > (3 * mid))) {
                        arr[i][indexJ] = symbol;

                        writer.write(arr[i][indexJ] + " ");
                        System.out.print(arr[i][indexJ] + " ");

                        indexJ++;
                    } else {
                        writer.write("  ");
                        System.out.print("  ");
                    }
                }
                System.out.println();
                writer.write("\n");
            }

            writer.flush();
        }
    }

    /**
     * Метод який знаходить для кожного під масива довжину
     *
     * @param row розмір масива
     * @return String[][]
     */
    public static String[][] createLengthOfEachSubArr(int row) {
        String[][] arr = new String[row][];

        int mid = row / 2;

        for (int i = 0; i < row; i++) {
            int length = 0;

            for (int j = 0; j < row; j++) {
                if ((i + j < mid) || (j - i > mid) || (i - j > mid) || (i + j > (3 * mid))) {
                    length++;
                }
            }

            arr[i] = new String[length];
        }

        return arr;
    }
}