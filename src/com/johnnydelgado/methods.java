package com.johnnydelgado;

public class methods {
    public static void main(String[] args) {
        int highScore = calculateScore(true,9000,5,100);
        System.out.println("Your final score is " + highScore);
        highScore = calculateScore(true,10000,8,200);
        System.out.println("Your final score is " + highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Johnny", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Randy", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Alan", position);

        position = calculateHighScorePosition(50);
         displayHighScorePosition("Brandon", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }else {
            return  -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " has managed to get into position " + playerPosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 3;
        } else if(playerScore >= 100){
            position = 3;
        }
        return position;
    }

}
