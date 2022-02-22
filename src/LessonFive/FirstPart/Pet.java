package LessonFive.FirstPart;

import LessonFive.FirstPart.Dog;

public class Pet extends Dog {
    public Pet(String name, int age) {
        super(name, age);
    }

//    public Pet() {
//    }


    public Pet(String name) {
        super(name);
    }

    // перегрузка методов  - кргда у одного метода много вариаций параметров
    public void  run() {
        System.out.println("Run");
    }

    public void  run(String name) {
        System.out.println("Run");
    }

    public void  run(int num) {
        System.out.println("Run");
    }

    public void  run(String smt, String smth) {
        System.out.println("Run");
    }


    // бесконечные параметры
    public void  run(String ... smth) {
       //цикл
    }
}
