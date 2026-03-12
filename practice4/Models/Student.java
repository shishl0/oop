package practice4.Models;

import practice4.Interfaces.CanHaveParty;
import practice4.Interfaces.CanHavePizza;
import practice4.Interfaces.CanHaveRetake;

public class Student extends Person implements CanHavePizza, CanHaveParty, CanHaveRetake {
    @Override
    public void move() { System.out.println("Student moves."); }

    @Override
    public void dance() { System.out.println("Student Dances! Hop-Hey-Lalaley!"); }

    @Override
    public void eatPizza() { System.out.println("Student eating Pizza! YUM!"); }

    @Override
    public void studyHard() { System.out.println("Student studying really hard while watching TikTok."); }
}