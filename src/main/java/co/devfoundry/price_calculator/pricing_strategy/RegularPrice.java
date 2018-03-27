package co.devfoundry.price_calculator.pricing_strategy;

public class RegularPrice implements PricingStrategy {

    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(!isSignedUpForNewsletter){
            System.out.println("Normalna cena: " + price + "zł");
        } else {
            System.out.println("Użytkownik zapisany do newslettera, należy wybrać inną strategię cenową!");
        }
    }

}
