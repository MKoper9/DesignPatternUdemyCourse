package decoratorHomework;

public class PotatoMeal extends Meal {


    public PotatoMeal() {
    }

    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie pomidorów");
    }

}
