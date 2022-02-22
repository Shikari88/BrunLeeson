package LessonFive.FirstPart;

import LessonFive.FirstPart.Animal;

// exteds - обозначет
public class Cat extends Animal {
    int liveCount;

    public Cat(String name, int age, int liveCount) {
        super(name, age);
        this.liveCount = getLiveCount();
    }

    public int getLiveCount() {
        return liveCount;
    }

    public void setLiveCount(int liveCount) {
        this.liveCount = liveCount;
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    //    private String name;
//    private int age;
//
//    public void eat(){
//        System.out.println("I'm eating");
//    }

}
