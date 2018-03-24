package co.devfoundry.price_calculator;

import co.devfoundry.price_calculator.pricing_strategy.PricingStrategy;

public class PriceCalculator {

    private PricingStrategy pricingStrategy;

    public void calculate(int price) {
        this.pricingStrategy.calculatePrice(price);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

}
