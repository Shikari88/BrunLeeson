package Qwer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Qwrert {
    public static void main(String[] args) {

        //тернарный оператор
//        int age1 = 25;
//        int age2 = 18;
//        int checkControl = age1 > age2 ? age1 : age2;
//        System.out.println(checkControl);

        //switch-case
//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();
//        switch (month){
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Winter");
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Spring");
//                break;
//             default:
//        }
        //Инкремент/Дикремент
        //i++;i--
        //a= a+5 => a += 5


        //Циклы
//        int value = 0;
//        while (value < 5) {
//            System.out.println("Hello");
//            value++; //если не прибвлять то буцудет выечный цикл
//        }
        //do while
//        Scanner scanner = new Scanner(System.in);
//        int v;
//        do {
//            v = scanner.nextInt();
//            System.out.println("Entered 5");
//        }  while (v !=5);
//        System.out.println("Enter 5");

        //for
//        for (int i = 0; i < 10; i++) {
//            if (i % 2==0) {
//                System.out.println(i);
//            }
//        }


        //Массивы
        //могут задаваться тремя видами. Если элемент не задан, а место выделено, по умолчанию выводит 0
        //могут быть только одного типа
//        int [] arr = new int[5]; //обязательно указать длину массива. 5 - длина массива
////        arr[0] = 1;
////        arr[1] = 2;
////
////        //Вывод массива через (Arrays.toString(arr));
////        System.out.println(Arrays.toString(arr));
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]);
////        }
////
////        int [] arr1 = new int[]{1,2,3};
////
////        int [] arr2 = {1,2,3,5};
////        System.out.println(Arrays.toString(arr2));
////        for (int i = 0; i < arr2.length; i++) {
////            System.out.println(arr[i]);
////        }

        Random random = new Random();
        int[] ints = new int[5];
        for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt(4);
        }
        System.out.println(Arrays.toString(ints));


        //Бесконечный цикл
//        for(;;) {
//            System.out.println("Arrays");
//        }


    }
}
