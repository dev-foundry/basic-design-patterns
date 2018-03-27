package co.devfoundry.price_calculator.pricing_strategy;

public class SalePrice implements PricingStrategy {

    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(isSignedUpForNewsletter){
            System.out.println("Przecena: " + price/2 + "zł");
        } else {
            System.out.println("Użytkownik nie jest zapisany do newslettera, należy wybrać inną strategię cenową!");
        }
    }

}
