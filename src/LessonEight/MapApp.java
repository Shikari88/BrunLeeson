package LessonEight;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapApp {

        public static void main(String[]args) {
            hashMap();
            linkedHashMap();
        }
        //Словари/хэштаблицы/хешмапы
        //Словари - ключ - зеачение
        public static void hashMap() {
            //по умолчанию длина массива 16.
            //HashMap<Integer, String> hashMap = new HashMap<>();
            HashMap<String, User> hashMap = new HashMap<>();

            User user = new User("fsd", "123");
            User user1 = new User("gfj", "456");
            User user2 = new User("qwe", "823");

            hashMap.put(user.getLogin(), user);
            hashMap.put(user1.getLogin(), user1);
            hashMap.put(user2.getLogin(), user2);

            //выводим всю мапу
            System.out.println(hashMap);


            //проверяет есть ли по ключу  значение аргумсента
            System.out.println(hashMap.containsKey("zxc"));
            System.out.println(hashMap.containsValue(user1));

            //удаление по ключу

            hashMap.remove(("fsd"));
            System.out.println(hashMap);


            //можно сохраниь удаленную часть
            User user3 = hashMap.remove(("fsd"));
            System.out.println(hashMap);


            for (Map.Entry<String, User> m : hashMap.entrySet()) {
                System.out.println(m.getKey());
                System.out.println(m.getValue());
            }


    }

    public static void linkedHashMap(){
        LinkedHashMap<String,Integer> linkedHashSet = new LinkedHashMap<>();
        linkedHashSet.put("Jun", 1);
        linkedHashSet.put("Jul", 2);
        linkedHashSet.put("Aud", 3);
        linkedHashSet.put("Sep", 4);

        System.out.println(linkedHashSet);
    }

    //здесть должна быть сортировка по ключу
    public static void TreeMap(){
        TreeMap<Integer,String> treeMap = new TreeMap();

    }




}


