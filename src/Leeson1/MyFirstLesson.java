package Leeson1;

import Lesson2.String;

import java.util.Scanner;

public class MyFirstLesson {
    // String - ожидание получить строку
//    public static void main(String[] args) { //основной метод проектв для запуска
////        /*System.out.println("Hello, Bruno");
////        System.out.println("Hello, Bruno");*/
////        //типы данных примети
////        byte b = 127;
////        //8 bit
////        short s = 31532;
////        // 16 bit
////        int i = 10000000;
////        // int занимает 32 бита
////        long l = 533333332353532L;// правило записи в конце ставить "L"
////        // 64 бита
////        float f = 3.5f;
////        //32b
////        double d = 6.6; // вмещае больше аданны х чем float
////        // 64
////        boolean b1 = false;
////
////        char c = '\u0950';
////        System.out.println(c);
////        int a = 10;
////        int b = 5;
////        System.out.println("сложение:" + (a + b)); //
////        System.out.println("остаток от деления :" + (a % b));
////        System.out.println("равенство :"+ (a == b));
////
////        int q = 100_003;
//        //byte a = 5,b = 3;
//
//        //явное преобразование
////        long l = 1100000L;
//////        int a = (int) l;
////        long l = 110000000000000000L;
////        int a = (int) l;
////        System.out.println(a);
////        int abs = 5;
////        if(abs>0){
////            System.out.println("V");
////        } else {
////            System.out.println("N");
////        }
//
//
////        // вывод числа
////    Scanner enter = new Scanner(System.in);
////    int qwe = enter.nextInt();
////        System.out.println("Мы ввели:" + qwe);
//
//
//
//        // проверка числа
////        Scanner enter = new Scanner(System.in);
////        System.out.println("Введите число");
////        int num = enter.nextInt();
////
////        if (num > 0) {
////            System.out.println("Полож");
////        } else {
////            System.out.println("Отриц");
////        }
//
////        Scanner enter = new Scanner(System.in);
////        System.out.println("Enter num");
////        int num = enter.nextInt();
////
////        if (num == 0) System.out.println("Вы ввели 0"); // можно писать без скобок но код менее читаемый
//
//
////        String s = "String"; // иннициализация строки
////        String newString = s + " Maxim";
////        System.out.println(newString);
//
////        String day = "Day";
//////        String and = "and";
//////        String night = "night";
//////        String newString1 = day + " " + and + " " + night;
//////        System.out.println(newString1);
//
//
//
//
//
//
//
//
//
//
//
//
//    //Scanner - тип данных
//        //new  - создание объекта
//        //
//        // enter - имя объекта
//        // класс - некий шаблон
//
////        int abs = 5;
////        if(abs>0){
////            System.out.println("V");
////        } else {
////            System.out.println("N");
////        }
//
//
//        //Task 1
////        Scanner enter = new Scanner(System.in);
////        String str = enter.nextLine();
////        System.out.println("Hello " + str);
//
//        //Task2
////        canner enter = new Scanner(System.in);
////        int a = enter.nextInt();
////        int b = enter.nextInt();
////        System.out.println(a+b);
////        System.out.println(a-b);
////        System.out.println(a*b);
////        System.out.println(a/b);
////        System.out.println(a%b);
////
//    Scanner enter = new Scanner(System.in);
//    int a = enter.nextInt();
//    int b = enter.nextInt();
//    String op = enter.next();
//    if (op.equals("+")) {
//        System.out.println(a+b);
//    } else if(op.equals("-")){
//        System.out.println(a-b);
//    }  else {
//        System.out.println("Введите значение");
//    }
//    }

    public static void main(String[] args) {
        //String s = "Have a nice day";
//        String s1 = "Have a nice day";
//        //System.out.println(s==s1);
//
//        String s2 = "Have a nice day";
//        String s3 = new String("Have a nice day"); //
//        System.out.println(s2==s3);

//        System.out.println(s.equals(s1));
//        System.out.println(s.equals(s3));

        // игнорирует регистры
//        System.out.println("HAVE a nice day".equalsIgnoreCase(s));

        //Перевод примитива в строку. Принужденное преобразование
//        String a = String.valueOf("1");
//        String b = String.valueOf("1.1");
//        String c = String.valueOf("c");
//        String d = String.valueOf("true");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(d);
//        System.out.println(c);


        //длина строки
//        int lenght = s.length();
//        System.out.println(s.length());


        // Переводод строки в примитив. У каждого примитоива есть класс обертка
        //Не раб
//        int i = Integer.parseInt("4343");
//        double i1 = Integer.parseInt("4.343");
//        System.out.println(i);
//        System.out.println(i1);

        // Опреление позиции элемента строки
//        String s4 = "Good morning";
//        System.out.println(s4.indexOf("d"));

        //Приведение строки к верхнему/нижнему рег
//        String s5 = s.toUpperCase();
//        System.out.println(s5);
//

//        //Получение под строки
//        String s6 = s5.substring(3,6);
//        System.out.println(s6);


        //Сравнение строк
        // если выдает 0, значит строки равны
//        String s7 = " Я буду программистом";
//        String s8 = " Я буду программистом";
//        String s9 = " Я буду";
//
//        int result = s7.compareTo(s8);
//        System.out.println(result);
//        //если стока больше по симвал, то
//        result = s8.compareTo(s9);
//        System.out.println(result);
//        // если строка меньше, то она введет отрицательный число
//        result = s9.compareTo(s8);
//        System.out.println(result);

//        String s10 = "have a nice day";
////        String s11 = s10.substring(0);
////        //String s12 = s11.toUpperCase();
////        System.out.println(s11);
        //Делать первый символ всегда Заглавной, остальные строчными
//        String s10 = "heLLo";
//        String s11 = s10.substring(1).toLowerCase();
//        String s12 = s10.substring(0,1).toUpperCase();
//        System.out.println(s12 + s11);

        // Менее ресурсозатратный метод для сложениея строк. по сравнению с "+"  и concat
//        StringBuilder stringBuilder = new StringBuilder(s);
////        stringBuilder.append("have").append("nice"); //добавляем слова
////        System.out.println(stringBuilder);
//        //Есть изменяемые и неизмен классы
//        //stringBuilder - изменяемый
//        //stringBuilder.reverse(); //в обр порядке
//        //stringBuilder.replace(1,5, "Nice");
//        stringBuilder.delete(1,5);
//        System.out.println(stringBuilder);
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//
//        if (count <= 100 && count >=90) {
//            System.out.println("тлично");
//        } else if (count <=89 && count >=60) {
//            System.out.println("хорошо");
//        } else if (count <=59 && count >=40) {
//            System.out.println("уд");
//        } else if(count <=39 && count >=0) {
//            System.out.println("сорян");
//        }

        int age1 = 25;
        int age2 = 18;
        int checkControl = age1 > age2 ? age1 : age2;
        System.out.println(checkControl);


    }
}
