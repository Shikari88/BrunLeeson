package LessonFive.Task;

public class Cat extends Animal {
    @Override
    public boolean run(int lenght) {
        if(lenght < 200) {
            return true;
        }
        return false;
    }

    @Override
    public boolean swim(int lenght) {
        return false;
    }

    @Override
    public boolean jump(int height) {
        if(height < 2) {
            return true;
        }
        return false;
    }
}
