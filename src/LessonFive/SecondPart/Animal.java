package LessonFive.SecondPart;

public abstract class Animal { // абстрактный класс не позвоялет создать объект


    // нечто, что точно должно быть
    //от обстактного класса начиет приложение
    public void eat(){
        System.out.println("I eat");
    }

    public abstract void jump();

}
