package ro.fasttrackit.curs10.homework.exercise2;

import ro.fasttrackit.curs10.homework.Basket;

public class Flower extends Buquet {


    private String  color;
    private int petals;

    public Flower(String flower, int petals, String color){
        super(flower);
        this.color = color;
        this.petals = petals;
    }

    public String getColor(){
        return  color;
    }

    public void setColor(){
        this.color=color;
    }

    public int getPetals(){
        return petals;
    }

    public void setPetals(){
        this.petals = petals;
    }

    public void flowerDetails(){
        System.out.println("Color: " + color + " "+ "Number of Petals: " + petals);
    }
}
