package stateHomework;

import java.util.Random;

public class TheCoinWasThrow implements State{


    static final private Random random = new Random();

    void winOrLoseGenerator(OneArmedBandit oneArmedBandit) {

    }

    @Override
    public void throwCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Pull the Lever");
    }

    @Override
    public void pullThelever(OneArmedBandit oneArmedBandit) {
         int result = random.nextInt(99);
        if(result<20){
            System.out.println("You are Win!");
            oneArmedBandit.state = new Win();

        }else {
            System.out.println("You are lose! Try again!");
            oneArmedBandit.state=new NoCoin();
        }

    }

    @Override
    public void takeTheWin(OneArmedBandit oneArmedBandit) {
        System.out.println("Pull the Lever");
    }

    @Override
    public void currentState(OneArmedBandit oneArmedBandit) {
        System.out.println("Pull the Lever");
    }
}
