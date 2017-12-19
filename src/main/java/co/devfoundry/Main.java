package co.devfoundry;

import co.devfoundry.chef.Chef;
import co.devfoundry.chef.egg_cooker.HardBoiledEggCooker;
import co.devfoundry.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {

        //Nowe zamówienie - jajka na twardo!
        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        //Nowe zamówienie - jajka na miękko!
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

    }

}
