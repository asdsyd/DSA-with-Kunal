package com.asad;
import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
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
