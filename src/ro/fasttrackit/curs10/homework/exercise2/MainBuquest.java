package ro.fasttrackit.curs10.homework.exercise2;

import ro.fasttrackit.curs10.homework.Basket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class MainBuquest {
    public static void main(String[] args) {

        Flower orhidee = new Flower("orhidee", 3, "albastra");
        orhidee.flowerDetails();
        Flower crizantema = new Flower("crizantema", 6, "galbena");
        Flower papadie = new Flower("papadie", 12, "galbena");
        Flower cactus = new Flower("cactus", 4, "roz");
        List<Flower> flowers;
        flowers = new ArrayList<Flower>();
        flowers.addAll(Collection<Flower>(crizantema,papadie,cactus));
        System.out.println(flowers);
       // for(String name : flowers){
          //  System.out.println(name);

    }
}
