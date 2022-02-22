package LessonFour;
//у класса должны быть данные Данные(поля)
//и Действия(методы)
//Соответсвеноо, в классе могут только поля и методы
//в одном файле только 1 класс. Класс публичный
public class Person {
    private String name;

    private int age;

    //геттеры и сеттеры
    //сеттеры принимают
    public void setName(String userName) {
        this.name = userName;
    }

    //геттеры возвращают
//    public String getName(){
//        return name;
//    }

    public void setAge(int userAge) {
        this.age = userAge;
    }
//    public Int getName(){
//        return name;
//    }


    public String getName() {
        return name;
    }

    public int Age() {
        return age;
    }
    double weight;
//   double height;


    //пустой метод. ничего не возвращает
    void showInfo() {
        System.out.println("Имя человека: " + name + "Возраст: " + age + "Вес: " + weight);
        //можно вывести 5 раз
//       for (int i = 0; i < 5; i++) {
//           System.out.println("Имя человека: " + name + "Возраст: " + age + "Вес: " + weight);
//       }
    }

    void speak() {
        System.out.println("Привет");
    }

    public Person(String name, int age) {
        setAge(age);
        setName(name);
    }



}
