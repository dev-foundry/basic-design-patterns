package co.devfoundry.price_calculator.pricing_strategy;

public class SalePrice implements PricingStrategy {

    public void calculatePrice(int price) {
        System.out.println("Przecena: " + price/2 + "zł");
    }

}
