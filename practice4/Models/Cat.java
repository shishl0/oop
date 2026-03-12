package practice4.Models;

import practice4.Interfaces.*;

public class Cat extends Animal implements CanHavePizza {
    void breath() { System.out.println("Breathing and Mur-Mur"); }
    
    @Override
    public void eatPizza() {
        System.out.println("Meowy eating Pizza!");
    }
}