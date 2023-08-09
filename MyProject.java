
package com.mycompany.myproject;


public class MyProject {

    public static void main(String[] args) {
        Employee emolpyee1 = new Employee("Hawra","developer", 8000.0,1,"bachelor", true);
        
        System.out.println("Total salary is: "+emolpyee1.calculateSalary());
    }
}
