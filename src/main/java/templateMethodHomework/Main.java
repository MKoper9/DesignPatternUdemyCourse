package templateMethodHomework;

import templateMethodHomework.days.MyDay;
import templateMethodHomework.days.TypeOfTransport;
import templateMethodHomework.days.WeekDay;
import templateMethodHomework.days.WeekendDay;

public class Main {
    public static void main(String[] args) {

        WeekDay myDay =new MyDay();
        myDay.everyDayIsExaclyTheSame(TypeOfTransport.BIKE);
        WeekDay weekendDay = new WeekendDay();
        System.out.println();
        weekendDay.everyDayIsExaclyTheSame(TypeOfTransport.CAR);

    }
}
