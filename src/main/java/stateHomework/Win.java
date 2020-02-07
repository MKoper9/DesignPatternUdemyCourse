package stateHomework;

import java.util.Random;

public class Win implements State {

    OneArmedBandit oneArmedBandit;



    @Override
    public void throwCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Take the Win!!");
    }

    @Override
    public void pullThelever(OneArmedBandit oneArmedBandit) {
        System.out.println("Take the Win!!");
    }

    @Override
    public void takeTheWin(OneArmedBandit oneArmedBandit) {
        System.out.println("Take the Win!!");
    }

    @Override
    public void currentState(OneArmedBandit oneArmedBandit) {
        System.out.println("Take the Win!!");
    }
}
