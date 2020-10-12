package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        apple – загаданное
        apricot - ответ игрока
        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        Для сравнения двух слов посимвольно, можно пользоваться:
        String str = "apple";
        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        Играем до тех пор, пока игрок не отгадает слово
        Используем только маленькие буквы*/

public class lesson3 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int pos = random.nextInt(words.length); //рандом для определения позиции слова
        String gameWord = words[pos]; //загаданное слово
        StringBuilder resultWord = new StringBuilder(("###############")); //открывается слово

        // вывод загаданного слова для дебага
        System.out.println(gameWord);

        //сканер для ввода слова игрока
        System.out.println("Угадайте загаданное слово из списка вариантов: \n " + Arrays.toString(words));

        Scanner sc = new Scanner(System.in);
        String playerWord = sc.next();

        chekWin(gameWord, resultWord, playerWord);

    }


    private static void chekWin(String gameWord, StringBuilder resultWord, String playerWord) {
        if (gameWord.equals(playerWord)){
            System.out.println("Победа! Вы отгадали загаданное слово: " + gameWord);
        }else
            System.out.println("Вы не угадали. Результат: " + searchChar(gameWord, resultWord, playerWord) + " \n Попробуйте еще.");

    }

    private static StringBuilder searchChar(String gameWord, StringBuilder resultWord, String playerWord) {
        for (int i = 0; i < playerWord.length(); i++) {
            if(gameWord.charAt(i) == playerWord.charAt(i)){
                resultWord.setCharAt(i, gameWord.charAt(i));
            } else
                resultWord.setCharAt(i, '#');
        } return resultWord;
    }


}
