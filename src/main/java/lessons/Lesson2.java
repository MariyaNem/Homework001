package lessons;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

//          task1();
//        task2();
//        task3("fffldk");
//        task5("fijrigd");
    }


//Дано N (>0) и символы а и б. Написать метод, возвращающий строку длинны N, которая состоит из чередующихся
// символов а и б начиная с а
    private static void task1() {

//        String[] c = new String[] {"A", "B"};
        char a = 'A';
        char b = 'B';
        Scanner in = new Scanner(System.in);
        System.out.print("Количество символов: ");
        int amountOfChar = in.nextInt();
        String result = "";
        char temp = b;
        for (int i = 0; i < amountOfChar; i++){
            if (temp == a){
                result += b;
                temp = b;
            } else {
                result += a;
                temp = a;
            }
        }
        System.out.println(result);

//        Scanner cs = new Scanner(System.in);
//        System.out.print("Input amount of chars: ");
//        int amountOfChar = cs.nextInt();
//
//        String[] c = new String[] {"A","b"};
//        StringBuilder result = new StringBuilder();

//        for (int i = 0; i < amountOfChar; i++) {
//            result.append(c[i % 2]);
//        }
//        System.out.println(result);


//        char a = 'A';
//        char b = 'b';
//        int n = 5;
//        String str = "" + a + b;
//        str = str.repeat(n / 2) + ((n % 2 == 1) ? a : "");
//        System.out.println(str);

    }

    // Напишите метод, сжимающий строку. aaooopppp -> 2a 3o 4p
    private static void task2() {

            String trash = "aaaabbbcddYYYYYoooooo00000";
            StringBuilder result = new StringBuilder();

            int counter = 1;

            for (int i = 0; i < trash.length() - 1 ; i++) {
                if ( trash.charAt(i + 1) != trash.charAt(i)) {
                    result.append(trash.charAt(i));
                    if (counter != 1) {
                        result.append(counter);
                    }
                    counter = 0;
                }

                counter++;
            }
            result.append((trash.charAt(trash.length() - 1))).append(counter);
            System.out.println(result);
    }

    public static boolean task3(String inputStr) {
        inputStr = inputStr.toLowerCase()
                .replace(" ", "")
                .replace("-","");
        for (int i = 0; i < inputStr.length() / 2; i++) {
            if (inputStr.charAt(i) != (inputStr.charAt(inputStr.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

//
//    private static void task5(String pathDir) {
//        File file = new File(pathDir);
//        if (!(file.exists() || file.isDirectory())) {
//            return;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (String fileName : file.list()) {
//            sb.append(fileName).append(System.lineSeparator());
//        }
//
//        try(PrintWriter pw = new PrintWriter("src/main/resources/files/filesNames.txt")) {
//            pw.print(sb);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }

}
