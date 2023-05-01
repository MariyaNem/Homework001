package hw2;
import java.util.*;
import java.io.File;

public class tasks {
    public static void main(String[] args) {

//        task01();
//        task2("D:\\Homework1\\Homework1\\src\\main\\java\\hw2\\task2hw2test");
    }


    //    1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//    используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//    Если значение null, то параметр не должен попадать в запрос.
//            Пример 1:
//    Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
//    Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
//
//    Пример 2:
//    Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
//    Результат: SELECT * FROM USER;
    private static void task01() {
        StringBuilder sb = new StringBuilder("SELECT * FROM USER WHERE ");

        String str = "\"name:Ivanov\" \"country:Russia\" \"city:Moscow\" \"age:null\"";
        String[] arr = str.split("\"?\\s+\"?|:\"?");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i += 2) {
            String k = arr[i];
            String v = arr[i + 1];
            if (!v.equals("null\"") && !v.equals("null")) {
                sb.append(k).append(" = ").append("'").append(v).append("' ");
            }
        }
        System.out.println(sb.toString());
    }


    //2.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//    1 Расширение файла: txt
//    2 Расширение файла: pdf
//    3 Расширение файла:
//    4 Расширение файла: jpg
    public static void task2(String path) {
        File myFolder = new File(path);
        for (File file : myFolder.listFiles()) {
            String name = file.getName();
            if (name.lastIndexOf(".") != -1) {
                System.out.println("Расширение файла: " + name.substring(name.lastIndexOf(".") + 1));
            }
        }
    }
}

