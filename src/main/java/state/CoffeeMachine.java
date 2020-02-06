package state;

public class CoffeeMachine {
    State state;

    public CoffeeMachine() {
        state = State.NO_COIN;
    }

    public void insertTheCoin() {
        switch (state) {
            case NO_COIN:
                System.out.println("Insert the coin");
                state = State.COIN_INSERDED;
                break;
            case COIN_INSERDED:
                System.out.println("Coin was inserted");
                break;
            case CUP_FULL:
                System.out.println("First take out the cup");
                break;
        }
    }

    public void pushTheButton() {
        switch (state) {
            case NO_COIN:
                System.out.println("No coin");
                break;
            case COIN_INSERDED:
                System.out.println("Pour coffee");
                state = State.CUP_FULL;
                break;
            case CUP_FULL:
                System.out.println("First take out the cup");
                break;
        }
    }

    public void takeTheCup() {
        switch (state) {
            case NO_COIN:
                System.out.println("No coin");
                break;
            case COIN_INSERDED:
                System.out.println("Press the button");
                break;
            case CUP_FULL:
                System.out.println("First take out the cup");
                state = State.NO_COIN;
                break;
        }
    }
    public void returnTheCoin() {
        switch (state) {
            case NO_COIN:
                System.out.println("No coin");
                break;
            case COIN_INSERDED:
                System.out.println("Return the coin");
                state = State.NO_COIN;
                break;
            case CUP_FULL:
                System.out.println("Too latep");
                break;
        }
    }

    public enum State {
        NO_COIN, COIN_INSERDED, CUP_FULL
    }
}
