package visitor.activity;

public class Treadmil {

    private int distance;

    public Treadmil(int distance) {
        this.distance = distance;
    }

    public void calculateCaloriesBurned(){
        System.out.println("Calories burned running of treadmil: " +distance*3);
    }
}
