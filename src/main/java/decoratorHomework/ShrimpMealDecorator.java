package decoratorHomework;

public class ShrimpMealDecorator extends MealDecorator {

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }
    public void prepareMeal() {
        meal.prepareMeal();
        addShirmip();
    }

    public void addShirmip(){
        System.out.println("Dodoaję krewetki");
    }


}
