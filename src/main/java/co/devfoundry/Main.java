package co.devfoundry;

import co.devfoundry.smart_app.SmartApp;

public class Main {

    public static void main(String[] args) {

        SmartApp smartApp = new SmartApp();
        smartApp.setVersion(1.0);
        System.out.println(smartApp);

        smartApp.setVersion(1.1);
        System.out.println(smartApp);

        smartApp.getVersionList().add(1.1);

        smartApp.setVersion(1.2);
        System.out.println(smartApp);

        smartApp.setVersion(2.0);
        System.out.println(smartApp);

        smartApp.setVersion(smartApp.getVersionList().get(0));
        System.out.println(smartApp);

    }

}
