package LessonFive.Task;

public class Dog extends Animal {
    @Override
    public boolean run(int lenght) {
        if(lenght < 500) {
            return true;
        }
        return false;
    }

    @Override
    public boolean swim(int lenght) {
        if(lenght < 10) {
            return true;
        }
        return false;
    }

    @Override
    public boolean jump(int height) {
        if(height < 500) {
            return true;
        }
        return false;
    }
}
