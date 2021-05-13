package com.johnnydelgado;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
/*        double kilometers = (100 * 1.609344);
        int highScore = 50;
        if (highScore == 50){
            System.out.println("This is an expression!");
        }*/
/*        calculateScore("Johnny", 500);
        int newScore = calculateScore("Johnny", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore(); */

        System.out.println(MethodOverloading.calcFeetAndInchesToCentimeters(7,5 ));
        System.out.println(MethodOverloading.calcFeetAndInchesToCentimeters(-1,6));
        System.out.println(MethodOverloading.calcFeetAndInchesToCentimeters(0,13));
        System.out.println(MethodOverloading.calcFeetAndInchesToCentimeters(182));

    }



}
