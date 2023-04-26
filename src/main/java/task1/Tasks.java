package task1;


import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

//        ts1();
//        ts2();
        ts3();
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
            System.out.println(arr[i]);
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

    private static void ts3() {

    }
}