package co.devfoundry;

import co.devfoundry.price_calculator.PriceCalculator;
import co.devfoundry.price_calculator.pricing_strategy.RegularPrice;
import co.devfoundry.price_calculator.pricing_strategy.SalePrice;

public class Main {

    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100);

    }

}
