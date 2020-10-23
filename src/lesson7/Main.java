package lesson7;

/*1. Расширить задачу про котов и тарелки с едой
       2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
       3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
       4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
       5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль
       6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку*/

import java.util.Scanner;

public class Main {
    static int BOWL = 10;
    static int MAX_BOWL = 30;
    public static void main(String[] args) {
        Cat [] arrCat = new Cat[3];
        arrCat[0] = new Cat("Vasy");
        arrCat[1] = new Cat("Musy");
        arrCat[2] = new Cat("Barsik");
        System.out.println("___Есть котики___");
        PrintArr(arrCat);
        System.out.println("___Пора их покормить___");
        feedTheCat(arrCat);
        System.out.println("___Итог кормления___");
        PrintArr(arrCat);


    }

    private static void feedTheCat(Cat[] arrCat){
        System.out.println("В миске для котов есть еды: " + BOWL);
        for (int i = 0; i < arrCat.length; i++) {
            if (arrCat[i].getFood() != false) {
                System.out.println("Котик " + arrCat[i].getName() + " сытый");
            } else {
                if (arrCat[i].getPortion() > BOWL) {
                    System.out.println("Котику " + arrCat[i].getName() + " не хватило еды");
                } else {
                    BOWL = BOWL - arrCat[i].getPortion();
                    arrCat[i].setFood(true);
                    System.out.println("Кот " + arrCat[i].getName() + " съел " + arrCat[i].getPortion() + "! в миске осталось: " + BOWL);
                }
            }
            }

        }

        private static void PrintArr(Cat [] arrCat){
            for (int i = 0; i < arrCat.length; i++) {
                arrCat[i].PrintInfoCat();

            }
        }

        private static int AddBowl(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Добавить еды в миску? (true / false)");
            boolean bn = scanner.nextBoolean();
            if (bn == true){
                return BOWL = MAX_BOWL;
                }else {
                System.out.println("Жадина");
                return BOWL;
            }

        }
}
