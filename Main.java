
import java.io.*;
import java.util.*;
import static java.lang.System.*;
import java.util.Scanner;
class Main {
    public static void main (String str[]){
      
        Pizza ny = new Pizza("New York Pizza", 7, true, 20.00, false);
        
        System.out.println(ny);

        System.out.println("Number of toppings offered in New York Pizza: " + ny.getNumToppings());
        System.out.println("Discount after lottery coupon: " + ny.discount() + " dollars off your order");
        System.out.println("Is there a huge variety (over 5) of toppings? " + ny.hugeVariety());

        Pizza chi = new Pizza("Chicago Pizza Place", 5, false, 19.50, false);

        System.out.println(chi);

        System.out.println("Discount after lottery coupon: " + ny.discount() + " dollars off your order");
        System.out.println("Is there a huge variety (over 5) of toppings? " + chi.hugeVariety());

        System.out.println("\nAre the pizza places equal? " + ny.equals(chi));
        


        //default pizzas
        Pizza def1 = new Pizza();
        Pizza def2 = new Pizza();
        System.out.println("\nThis is Default pizza 1" + def1);
        System.out.println("\nThis is Default pizza 2" + def2);
        System.out.println("\nAre the default pizzas equal? " + def1.equals(def2));
    }
}
