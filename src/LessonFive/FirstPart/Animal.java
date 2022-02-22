package LessonFive.FirstPart;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println("I'm eating");
    }

    public void makeSound(){
        System.out.println("звук");
    }

}
