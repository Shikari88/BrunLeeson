package LessonFive.FourPart;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        test(animal);
        test(cat);
        test(dog);
    }

    //Полиморфизм
    // Все объекты которые наследют методы от класса энимал иогут вызываться в одном месте
    public static void test(Animal animal){
        animal.eat();
    }
}
