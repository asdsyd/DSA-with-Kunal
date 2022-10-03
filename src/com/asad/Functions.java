package com.asad;


public class Functions {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        String custom = myGreet("Asad");
        System.out.println(custom);
    }

    static String myGreet(String name) {
        String message = "Hello " + name ;
        return message;
    }

    static String greet() {
        String greeting = "How are yo ?";
        return greeting;
    }



}
