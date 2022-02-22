package LessonFive.FirstPart;

import LessonFive.FirstPart.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {

        //super - указывает на контруктор супер класса
        super(name, age);
    }
    //public Dog(String name)
//    private String name;
//    private int age;
//
//    public void eat(){
//        System.out.println("I'm eating");
//    }


    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("ГАв");;
    }
}
