package LessonEight;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {
        hashSet();
        linkedHashSet();

    }
        // hashSet - это структура  данных , хаотичная,
    public static void hashSet(){
        //множество - особенность - не может хранить одинаковые элеаменты.
        // не можем брать по индексу. Элементы расположденны хаотично и не гарантирована последовательномсть. эл-ты храняться по хешу

        //Set
        HashSet<Integer> ints = new HashSet<>();
        ints.add(54);
        ints.add(65);
        ints.add(53);
        ints.add(54);
        System.out.println(ints);
        System.out.println(ints.size());
        System.out.println(ints.isEmpty());
        System.out.println(ints.contains(65));
        System.out.println(ints.contains(1));

        // вывод элементов массива
        for (Integer i: ints) {
            System.out.println(i + " ");
        }
    }

    //LinkedHashSet- обеспечивает порядок множесмтва (структуры данных)
    public static void linkedHashSet(){
        LinkedHashSet<String> string= new LinkedHashSet<>();
        string.add("fds");
        string.add("fwe");
        System.out.println(string);
    }


    //дерево множеств, которое сортурует входящий объект(числа от меньшего к большему. Символы по алфовиту)
    public static void TreeSet(){
        Student student = new Student("Hanna", 18);
        Student student1 = new Student("Jann", 19);
        Student student2 = new Student("Wanna", 16);
        Student student3 = new Student("Guanna", 20);


        //интерфейс Сomparable - служить для описания способа сравнения объекта и для дальнейшего упорядочивания
//        TreeSet(Student) students = new TreeSet<>();
//        student.add(student);
//        student.add(student1);
//        student.add(student2);
//        student.add(student3);
//        System.out.println(students);

    }


}
