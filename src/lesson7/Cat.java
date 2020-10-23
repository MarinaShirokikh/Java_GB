package lesson7;

import java.util.Random;

public class Cat {
    private String name;
    private int portion = 0;
    private boolean food = false; //сытость (при создании голодные, если покушал - true);
    private final Random random = new Random ();

    Cat(String name){
        this.name = name;
        this.portion = random.nextInt(10) + 1;
        this.food = false;

    }

    public void PrintInfoCat(){
        System.out.println("Кот " + name + " сытый? " + food + " (порция = " + portion + ")");
    }

    public void setFood(boolean food){
        this.food = food;
    }

    public int getPortion(){
        return this.portion;
    }

    public String getName(){
        return this.name;
    }

    public boolean getFood(){
        return this.food;
    }
}
