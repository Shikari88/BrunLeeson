package LessonThree;
//у класса должны быть данные Данные(поля)
//и Действия(методы)
//Соответсвеноо, в классе могут только поля и методы
//в одном файле только 1 класс. Класс публичный
public class Person {
   String name;
   String surname;
   int age;
   double weight;
   double height;


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

   //метод установки имени person
   void setName(String userName) {
       name = userName;
   }

    //метод установки имени person
    void setAge(int userAge) {
        age = userAge;
    }


}
