package LessonFive.ThirdPart;

public class Person implements Info, Move{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public  void sayHello() {
        System.out.println("Hello.");
    }

    @Override
    public void showInfo() {

    }

    @Override
    public void moving() {

    }
}
