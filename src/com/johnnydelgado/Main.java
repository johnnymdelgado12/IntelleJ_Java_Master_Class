package com.johnnydelgado;

public class Main {
    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
/*        double kilometers = (100 * 1.609344);
        int highScore = 50;
        if (highScore == 50){
            System.out.println("This is an expression!");
        }*/
        calculateScore("Johnny", 500);
        int newScore = calculateScore("Johnny", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unknown player scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

}
