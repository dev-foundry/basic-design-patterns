package co.devfoundry;

import co.devfoundry.meal.*;

public class Main {

    public static void main(String[] args) {

        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();

        System.out.println("\nNowy posiłek: ");

        Meal potatoMealWithChickenAndSauce = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();

    }

}
