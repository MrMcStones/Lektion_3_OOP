package com.rasmus.OOP;

import com.rasmus.OOP.model.Student;

public class Main {
    public static void main(String[] args) {

        System.out.println("Is this the first commit?");

        // Instantiate Object
        // Value inside params goes direct to Constructor
        Student benny = new Student("Benny", 15, true);
        Student frida = new Student("Frida", 22, false);

        System.out.println(benny.age);
        System.out.println(benny.isTired);
        if (benny.isTired) {
            System.out.println("I'm tired");
        } else {
            System.out.println("I'm not tired");
        }
        System.out.println(frida.name);
        System.out.println(frida.age);
        System.out.println(frida.isTired);
        if (frida.isTired) {
            System.out.println("I'm tired");
        } else {
            System.out.println("I'm not tired");
        }


        int sum;

        sum = addition(15, 15);
        sum += 1;
        System.out.println(sum);

        /* How to create a method
        #1 Visibility modifier: public, protected, no-mod, private
        #2 Static: exclude if not needed - reference
        #3 DataType to return: Send data. If nothing == Void
        #4 Name: camelCase (addTwoNumbers)
        #5 Params: ()
        #6 Body: {}
         */
    }


    // Params == () == Within: Parametrar
    public static int addition(int x, int y) {
        return x+y;
    }

}
