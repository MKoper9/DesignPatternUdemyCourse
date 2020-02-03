package decoratorHomework;

public class SauceMealDecorator extends MealDecorator {


    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }

    public void addSauce() {
        System.out.println("Dodaję sos");
    }


}
