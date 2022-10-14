package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        //challenge
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Diablo", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Gerald", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Triss Marigold", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Cyril", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Luise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Frank", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Bob", highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;
    }

    //challenge
    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position: "
                + highScorePosition + " on the high score table");

    }

    //challenge
    public static int calculateHighScorePosition(int playerScore) {
        //No1
//        if(playerScore >= 1000) {
//            return  1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >= 100 && playerScore <500) {
//            return 3;
//        } else {
//            return 4;
//        }

        //No2
//        if(playerScore >= 1000) {
//            return  1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;
//        }
        int position = 4; //assuming position 4 will be returned
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}



