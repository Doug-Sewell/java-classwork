package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Jim", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(900));
        displayHighScorePosition("Andy", calculateHighScorePosition(400));
        displayHighScorePosition("Kim", calculateHighScorePosition(50));

    }

    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " is in position " + scorePosition + " on the high score table!");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
