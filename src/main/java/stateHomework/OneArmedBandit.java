package stateHomework;

public class OneArmedBandit {

    State state;

    public OneArmedBandit(){

        state = new NoCoin();
    }

    public void noCoin(){
        state.throwCoin(this);
    }

    public void theCoinWasThrow(){
        state.pullThelever(this);
    }
    public void winOrLose(){
        state.currentState(this);
    }

}
