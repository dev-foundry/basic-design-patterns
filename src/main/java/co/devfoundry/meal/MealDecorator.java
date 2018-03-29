package co.devfoundry.meal;

public abstract class MealDecorator extends Meal {

    Meal meal;

    MealDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeal() {
        this.meal.prepareMeal();
    }

}
