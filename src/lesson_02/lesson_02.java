package lesson_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 */
public class lesson_02 {
    public static void main(String[] args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        zamena();
        // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        newArr8();
        // 3. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1]. пройти по нему циклом, и числа меньшие 6 умножить на 2;
        arrUmnoz(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        arrtable(10); //при вызове задаю размер массива
        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] arrWork = {-1, 5, 3, 20, 7, 7, 5, 0, 4, 8, 9, 15};
        System.out.println("Задание 5: В массиее: " + Arrays.toString(arrWork) + " определены max " + maxArr(arrWork) + " и min " + minArr(arrWork));
        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        int[] arrBalance = {2, 2, 2, 1, 2, 2, 14, 1};
        System.out.println("6. Массив: " + Arrays.toString(arrBalance) + " сбалансирован? - " + checkBalance(arrBalance));

    }

    private static void zamena() {
        System.out.print("Массив с заменой 0-1: ");
        int[] arr = {1, 1, 0, 0, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1; //тернарный оператор
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    private static void newArr8() {
        System.out.print("Массив на 8: ");
        int[] arr = new int[8];
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j += 3;
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    private static void arrUmnoz(int[] arr) {
        System.out.print("Создан массив и умножение на 2: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    private static void arrtable(int x) {
        System.out.println("Таблица на " + x + ": ");
        int[][] table = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                table[i][j] = (i == j) ? 1 : 0; //тернарный оператор
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    private static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int minArr(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


    private static boolean checkBalance(int[] bArr) {
        boolean result = false;
        int summ = bArr[0];
        int half;
        for (int i = 1; i < bArr.length; i++) {
            summ = summ + bArr[i];
        }
        if ((summ % 2) != 0) {
            System.out.println("Cумма чисел массива: " + summ + " не делится пополам");
            return false;
        }
        half = summ / 2;
        int count = 0;
        for (int i = 0; i < bArr.length; i++) {
            count += bArr[i];
            if (count == half) {
                System.out.println("Cумма чисел массива: " + summ + ", делится пополам на " + half + "count" + count);
                result = true;
            } else
                if (count > half) {
                break;
            }
        }
        return result;

    }


}
