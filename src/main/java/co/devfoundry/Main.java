package co.devfoundry;

import co.devfoundry.meal.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Nowy posiłek: ");
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();

        System.out.println("\nNowy posiłek: ");
        Meal riceMealWithShrimp = new ShrimpMealDecorator(new RiceMeal());
        riceMealWithShrimp.prepareMeal();

        System.out.println("\nNowy posiłek: ");
        Meal potatoMealWithChickenAndSauce = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();

    }

}
