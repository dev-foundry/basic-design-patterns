package co.devfoundry;

import co.devfoundry.flyweight.Destroyer;
import co.devfoundry.flyweight.Rifleman;
import co.devfoundry.flyweight.TeslTank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<>();

        for(int i = 0;i<1000000;i++) {
            activeUnits.add(new TeslTank("TeslaTank",200,100,50,25,0,0, 500));
            activeUnits.add(new Rifleman("Rifleman", 25, 5, 20, 25, 0, 0, 50));
            activeUnits.add(new Destroyer("Destroyer", 500, 250, 70, 10, 0, 0, 800));
        }

    }

}
