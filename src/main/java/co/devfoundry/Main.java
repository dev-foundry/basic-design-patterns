package co.devfoundry;

public class Main {

    public static void main(String[] args) {

        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas","Los Angeles").build();

        System.out.println(leg);
    }

}
