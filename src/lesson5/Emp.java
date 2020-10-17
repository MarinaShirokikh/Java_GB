package lesson5;
/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
2. Конструктор класса должен заполнять эти поля при создании объекта;
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
4. Создать массив из 5 сотрудников
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;**/

public class Emp {
    private String surname;
    private String position;
    private String email;
    private String mobile;
    private int salary;
    private int birthDate;
    private static final int CURRENT_YEAR = 2020;


    //публичный конструктор для вызова из вне
    public Emp(String surname, String position, String email, String mobile, int salary, int birthDate) {
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
        this.birthDate = birthDate;

    }

    public void info(){
        System.out.println("Фамилия: " + surname + ", Должность: " + position + ", e-mail: " + email + ", моб. т.: " + mobile + ", Зарплата: " + salary + ", Возраст: " + getAge());
    }

    public int getAge() {
        return CURRENT_YEAR - birthDate;
    }

}
