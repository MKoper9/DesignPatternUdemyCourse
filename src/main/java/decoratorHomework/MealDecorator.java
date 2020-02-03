package decoratorHomework;

public class MealDecorator extends Meal {
    Meal meal;

    public MealDecorator(Meal meal) {
        super();
        this.meal = meal;
    }
}
