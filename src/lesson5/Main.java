package lesson5;

public class Main {
    public static void main(String[] args) {
        //создание нового объекта и вывод информации с помощью метода
        Emp emp1 = new Emp("Ivanov", "Director", "888@gmail.com", "777-0000909", 150, 1965);
        //вызов метода класса, который воводит информацию об объекте
        emp1.info();
        System.out.println();

        //инициализация массива данных о сотрудниках
        Emp[] arr = new Emp[5];
        arr[0] = new Emp("Ivanov", "Director", "888@gmail.com", "777-0000909", 150, 1965);
        arr[1] = new Emp("Petrova", "Buh", "444@gmail.com", "333-33442344", 100, 1985);
        arr[2] = new Emp("Sidorov", "Manager", "111@gmail.com", "666-34534523", 120, 1988);
        arr[3] = new Emp("Pupkin", "Security", "555@gmail.com", "555-2342352", 110, 1970);
        arr[4] = new Emp("Levin", "Operator", "999@gmail.com", "4342-23423423", 80, 1999);
        System.out.println("Список сотрудников:");
        for (int i = 0; i < arr.length; i++) {
            arr[i].info();
        }
        System.out.println();

        //печать инфо о сотрудниках старше 40 лет
        printInfoAge(arr);

    }

    private static void printInfoAge(Emp[] arr) {
        System.out.println("Сотрудники, старше 40 лет:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40) {
                arr[i].info();
            }
        }
        System.out.println();
    }


}
