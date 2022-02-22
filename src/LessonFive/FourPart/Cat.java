package LessonFive.FourPart;

public class Cat extends Animal {

    //переопределили(подстроили) метод под кэт.
    @Override
    public void eat() {
        System.out.println("dog eat");
    }
}
