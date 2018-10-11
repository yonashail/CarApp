package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<car> cars = new ArrayList<>();

        while (true) {
            System.out.println("Enter a make and model:");
            car c = new car();
            String Make = scan.next();
            c.setMake(Make);
            String Model = scan.next();
            c.setModel(Model);

            // clear out the buffer
            scan.nextLine();

            //add the car to arraylist

            cars.add(c);

            //allow the user to input another car
            System.out.println("Do you want to Enter another car? (y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                break;
            }}
            //print out the cars

            for (car eachcar: cars){
                System.out.println(eachcar.display());
            }

            System.out.println("GoodBye!!");

        }

}
