package LessonThree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int rand = (int) Math.random();
//        System.out.println(rand);


//    String[] strings = {"Kos","Max","Den", "Jen"};
//    System.out.println(Arrays.toString(strings));
//    int count = 0;
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i].equals("Max")){
//                strings[i] = null;
//            }
//        }
//        System.out.println(Arrays.toString(strings));
//        System.out.println(strings.length);
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i] !=null){
//                count++;
//            }
//        }

//        String s = "I love Java";
//        String[] strings = s.split(""); //нужен когда надо посивольно рабить строку. Можно заменять, считать
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i].equals("I")) {
//                strings[i] = "They";
//            }
//        }
//        String res = String.join("", strings);
//        System.out.println();




        //Задать размер массива с консли, затем задать значение массива тоже с консоли
//        int a = scanner.nextInt();
//        int[] ints = new int[a];
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(ints));

        //скопировать все  положительные числа в новый массив
//        int [] ints = {-3, 2, -5, 6, -1};
//        int count = 0;
//        for (int i = 0; i < ints.length; i++) {
//            if(ints[i] > 0) {
//                count++;
//            }
//        }
//        int[] newInts = new int[count];
//        int index = 0;
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i] > 0) {
//                newInts[index] = ints[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(newInts));

        //Найти максимальный элемент массива
//        int [] ints = {-3, 2, -5, 6, -1};
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < ints.length; i++) {
//            max = Math.max(max,ints[i]);
//        }
//        System.out.println(max);
//
//
//        //предмакимальный
//        int prevMax = Integer.MIN_VALUE;
//        for (int i = 0; i < ints.length; i++) {
//            //текущее число
//            if(ints[i] < max) {
//                prevMax = Math.max(ints[i], prevMax);
//            }
//        }
//        System.out.println(max);
//        System.out.println(prevMax);



        //Класс Array
//        int [] ints = {-3, 2, -5, 6, -1};
//        System.out.println(Arrays.toString(ints));
//
//        Arrays.sort(ints);
//        System.out.println(Arrays.toString(ints));
//
//        System.out.println(Arrays.binarySearch(ints,6));//выдает индекс элемента
//
//        int[] newArr = Arrays.copyOf(ints,3); // копирует массив . Если задается длина меньше, то массив обрезается
//        System.out.println(Arrays.toString(newArr));
//
//        int[] newArrr = Arrays.copyOfRange(ints,1,4); // вырезает кусок массимва
//        System.out.println(Arrays.toString(newArrr));
//
//        int[]a = {1,2,3};
//        int[]b = {1,2,3};
//        System.out.println(Arrays.equals(a,b));

        //Многомерный массивы

//        int[][] array = new int[5][5];
//        System.out.println(Arrays.deepToString(array));
//
//        int[][] arr = {{1,2,3},
//                {3,4,2},
//                {6,5,5}};
//        //получаем элемент
//        System.out.println(arr[0][0]);
//        System.out.println(arr[1][1]);
//        System.out.println(arr[0][1]);
//        System.out.println(arr.length);
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length ; j++) {
//                System.out.println(i+ " " + j + "" );
//            }
//        }
//        int [] ints = {1, 1, 0, 0, 1};
//        for (int i = 0; i < ints.length; i++) {
//            if(ints[i] == 1) {
//                ints[i] = 0;
//            } else {
//                ints[i] = 1;
//            }
//        }
//        System.out.println(Arrays.toString(ints));


//        int s = scanner.nextInt();
//        int f = 0;
//        for (int i = 0; i <= s; i++) {
//            f = f + i;
//        }
//        System.out.println(f);

          // доработать
//        Random random = new Random();
//        int[] ints = new int[5];
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = random.nextInt(4);
//        }
//        System.out.println(Arrays.toString(ints));
//        int [] int1 = {6, 5, 4, 3, 2};
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < ints.length; i++) {
//           min = Math.min(min,int1[i]);
//        }
//        System.out.println(min);

    }
}
