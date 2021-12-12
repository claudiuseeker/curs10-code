package ro.fasttrackit.curs10.homework.exercise2;

public class Buquet{

    private String flower;

    public Buquet(String flower) {
        this.flower = flower;
    }

    public String getFlower(){
        return flower;
    }

    public void setFlower(){
        this.flower = flower;
    }

    public void flowerType(){
        System.out.println("tipul de floare: " + flower);
    }

}
