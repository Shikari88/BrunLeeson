package LessonFive.FirstPart;

import java.util.Objects;

public class Mountain {

    private String name;
    private int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }


    //Проверка равны объектов. Сравнивает по полям
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mountain mountain = (Mountain) o;
        return height == mountain.height &&
                Objects.equals(name, mountain.name);
    }

    @Override
    public int hashCode() { // это объект представлений в числовом виде. почитать про хэшкоды
        return Objects.hash(name, height);
    }
}
