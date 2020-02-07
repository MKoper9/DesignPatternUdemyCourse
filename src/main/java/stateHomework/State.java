package stateHomework;

public interface State {

    void throwCoin(OneArmedBandit oneArmedBandit);
    void pullThelever (OneArmedBandit oneArmedBandit);
    void takeTheWin (OneArmedBandit oneArmedBandit);
    void currentState(OneArmedBandit oneArmedBandit);

}
