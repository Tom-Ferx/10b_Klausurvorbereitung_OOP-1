package com.cc.java;

public class App {
    
    public static void main(String[] args) {

    // Test --> Referenztyp (reference type)
    // test --> Referenzvariable / RAM-Adresse des Objekts/Instanz (object/instance)
    // Object <--> Instanz

    Test test  = new Test();
    System.out.println("Referenzvariable: " + test);
    test.showAddress();

    }

}
