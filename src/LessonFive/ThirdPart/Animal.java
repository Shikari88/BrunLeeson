package LessonFive.ThirdPart;

public class Animal implements Info{
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I sleep");
    }

    @Override
    public void showInfo() {
    }


}
