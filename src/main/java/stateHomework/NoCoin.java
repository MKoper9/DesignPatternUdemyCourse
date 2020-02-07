package stateHomework;

public class NoCoin implements State {
    @Override
    public void throwCoin(OneArmedBandit oneArmedBandit) {
        System.out.println("Throw The Coin");
        oneArmedBandit.state=new TheCoinWasThrow();
    }

    @Override
    public void pullThelever(OneArmedBandit oneArmedBandit) {
        System.out.println("Throw The Coin");
    }

    @Override
    public void takeTheWin(OneArmedBandit oneArmedBandit) {
        System.out.println("Throw The Coin");
    }

    @Override
    public void currentState(OneArmedBandit oneArmedBandit) {
        System.out.println("Throw The Coin");
    }
}
