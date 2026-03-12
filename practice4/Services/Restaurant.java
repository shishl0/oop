package practice4.Services;

import practice4.Interfaces.CanHavePizza;
import practice4.Models.Person;

public class Restaurant {
    public boolean servePizza(CanHavePizza eater) {
        System.out.println("Serving Pizza with size: " + CanHavePizza.PIZZASIZE);
        eater.eatPizza();
        
        // Getting payment ONLY from Person. Cats are unavailable to pay
        if (eater instanceof Person) {
            System.out.println("Getting money to Kassa");
            return true;
        }
        
        System.out.println("No money needed from Animals or Cats.");
        return false;
    }
}