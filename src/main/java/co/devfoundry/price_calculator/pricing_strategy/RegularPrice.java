package co.devfoundry.price_calculator.pricing_strategy;

public class RegularPrice implements PricingStrategy {

    public void calculatePrice(int price) {
        System.out.println("Normalna cena: " + price + "zł");
    }

}
