package lesson8;
/*Вывести на консоль матрицу из инткрементов (размер 5 на 5)*/

import java.util.Arrays;

public class lesson8 {
    public static void main(String[] args) {
        int m = 5; //строки
        int n = 5; //столбцы
        int s = 1; // значение для заполнения, начнем с 1
        int [][] arr = new int[m][n];

        //заполнение периметра массива по часовой стрелке
        for (int y = 0; y < n; y++) {
            arr[0][y] = s;
            s++;
        }
        for (int x = 1; x < m; x++) {
            arr[x][n-1] = s;
            s++;
        }
        for (int y = n - 2; y >= 0; y--) {
            arr[m-1][y] = s;
            s++;
        }
        for (int x = m-2; x > 0; x--) {
            arr[x][0] = s;
            s++;
        }

        //Теперь заполнение середины массива, где периметр != 0, потому что уже заполен
        int c = 1; //координаты ячейки для следующего заполнения
        int d = 1;
        while(s < m * n){
            //движение вправо
            while (arr[c][d+1] == 0){
                arr[c][d] = s;
                s++;
                d++;
            }
            //движение вниз
            while (arr[c+1][d] == 0){
                arr[c][d] = s;
                s++;
                c++;
            }
            //движение влево
            while (arr[c][d-1] == 0){
                arr[c][d] = s;
                s++;
                d--;
            }
            //движение вверх
            while (arr[c-1][d] == 0){
                arr[c][d] = s;
                s++;
                c--;
            }
        }

        //в центре осталась ячейка с 0, заполняем ее
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (arr[x][y] == 0){
                    arr[x][y] = s;
                }
            }
        }


        //Печать результата
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(arr[x][y] + "  ");
            }
        System.out.println("");
        }
    }

}
