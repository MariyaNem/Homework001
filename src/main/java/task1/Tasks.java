package task1;


import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

//        ts1();
//        ts2();
//        ts3();
    }


    //1.Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
//длиной len, каждая ячейка которого равна initialValue;
    private static void ts1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите len: ");
        int len = in.nextInt();
        System.out.print("Введите initialValue: ");
        int initialValue = in.nextInt();

        int[] arr = new int[len];
        for (int i = 0; i <= arr.length-1; i++){
            arr[i] = initialValue;
            System.out.printf("%d ", arr[i]);
        }
    }

//2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    private static void ts2() {
        int[] arr = new int[] {3,5,6,1,4};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <= arr.length-1; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("max = " + max + "; min = " + min);
    }

//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
//    цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
//    то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void ts3() {

        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - i - 1] = 1;
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
