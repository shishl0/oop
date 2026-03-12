package practice4;

import practice4.Interfaces.CanHavePizza;
import practice4.Models.Cat;
import practice4.Models.Student;
import practice4.Services.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant delPapa = new Restaurant();
        
        CanHavePizza myCat = new Cat();
        Student kbtuStudent = new Student();
        
        System.out.println("--- Visitor: Cat ---");
        delPapa.servePizza(myCat);
        
        System.out.println("\n--- Visitor: Student ---");
        delPapa.servePizza(kbtuStudent);
        kbtuStudent.dance();
    }
}