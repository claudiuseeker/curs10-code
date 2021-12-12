package ro.fasttrackit.curs10.homework;

import java.util.*;

public class MainBasket {
    public static void main(String[] args) {

      /* Basket[] basket = new Basket[4];
       basket[0]= new Basket("Mar");
        basket[1]= new Basket("Para");
        basket[2]= new Basket("Caisa");
        basket[3]= new Basket("Piersica");

        Set<Basket> basketList = new HashSet<Basket>();
        basketList.add(basket[0]);
        basketList.add(basket[1]);
        basketList.add(basket[2]);
        basketList.add(basket[3]);

        for(String item : basket){
            System.out.println(item);
        }
        Iterator<Basket> iterator = basketList.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

       */

        // public String[] showList(){
        //  for(int i=0;i<=basket.size();i++ ){
        //  System.out.println(basket.get(i).getFruit());
        // }
        // }

        List<Basket> fruits;
        fruits = new ArrayList<Basket>();
        fruits.add(new Basket("Para"));
        Basket basket0 = fruits.get(0);
        fruits.add(new Basket("Mar"));
        Basket basket1 = fruits.get(1);
        System.out.println(basket1.getFruit());
        fruits.add(new Basket("Mar"));
        Basket basket2 = fruits.get(2);
        System.out.println(fruits);
        for (Basket fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("-----");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

     /*   public boolean removeFruit(Basket item) {
            for (Basket fruit : fruits) {
                if (fruit.equals(item)) {
                    fruits.remove(item);

                }
            }
        }

      */

    }
}
