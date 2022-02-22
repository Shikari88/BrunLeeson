package LessonFive.FirstPart;

public class Test {
    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        Dog dog1 = new Dog();
//        cat1.eat();
//        dog1.eat();



        Mountain ever = new Mountain("Everest", 8000);
        Mountain ever1 = new Mountain("Everest", 8000);
        Mountain ever2 = new Mountain("Everest1", 8000);
        //Mountain elb = new Mountain("Elbrus", 5800);
        System.out.println(ever.equals(ever1));

        System.out.println(ever.hashCode());
        System.out.println(ever1.hashCode());
        System.out.println(ever2.hashCode());

        //если равныф хэш коды то и иколсфы равны

        Animal animal = new Animal("few", 0 );
        animal.makeSound();



    }
}
