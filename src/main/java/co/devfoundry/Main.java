package co.devfoundry;

import co.devfoundry.chef.Chef;

public class Main {

    public static void main(String[] args) {

        //Nowe zamówienie - jajka na twardo!
        Chef chef = new Chef("Gordon Gessler");
        chef.cook();
        //Nowe zamówienie - jajka na miękko!
        chef.cook();

    }

}
