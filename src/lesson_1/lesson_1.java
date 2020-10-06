package lesson_1;

/*
 Создать пустой проект в IntelliJ IDEA и прописать метод main();
2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
 если да – вернуть true, в противном случае – false;
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное;
 Замечание: ноль считаем положительным числом.
6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным,
кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class lesson_1 {
    public static void main(String[] args) {
        // п.2
        byte by = 5;
        short c = 12333;
        int i = 5000;
        long l = 300000L;
        float f = (float) 3.14;
        double d = 3.1433;
        char ch = '8';
        boolean y = true;

        // п.3.
        System.out.println(calc(2, 3, 5, 2));
        // п. 4 сумма двух чисел
        System.out.println(range(5, 6));
        // п. 5
        negativOrPozitiv(0);
        // п. 6
        negativOrPozitivTF(-5);
        // п. 7
        namePrint("Вася");
        year(1900);

        }

    public static float calc(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    public static boolean range(int a, int b){
        a = a+b;
        if ((a >= 10)&&(a<=20)) {
            return true;
        }else return false;
    }

    public static void negativOrPozitiv(int a){
        if (a<0){
            System.out.println("Значение отрицательное: " + a);
        }
        else System.out.println("Значение положительное: " + a);
    }

    public static boolean negativOrPozitivTF(int a){
        if (a<0){
            System.out.println("Значение отрицательное: " + a);
            return true;
        }
        else System.out.println("Значение положительное: " + a);
        return false;
    }

    public static void namePrint(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void year(int a){
        float res4, res100, res400;
        res4 = a % 4;
        res100 = a % 100;
        res400 = a % 400;
        if (((res4 == 0) && (res100 != 0) && (res400!=0)) || ((res4 == 0) && (res100 == 0) && (res400==0))) {
            System.out.println(a + " - Високосный год");
        } else System.out.println(a + " - Не високосный год");
    }

}
