package singletonHomework;

public class GuessGame {

    private int scores = 100;

    private static GuessGame guessGame = new GuessGame();

    public void play(){

    }

    public int getScore() {
        return scores;
    }

    public static GuessGame getInstance(){
        return guessGame;
    }
}
