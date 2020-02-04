package templateMethodHomework.days;

public class WeekendDay extends WeekDay {
    @Override
    protected void work() {
        System.out.println("I am not going to work in this dayHave a good time.");
    }

    @Override
    protected int goToWork(TypeOfTransport transport) {
        return 0;
    }
}
