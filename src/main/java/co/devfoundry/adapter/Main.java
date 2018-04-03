package co.devfoundry.adapter;

import co.devfoundry.adapter.api.LibraryAPI;
import co.devfoundry.adapter.api.LibraryAPIImpl;

public class Main {

    public static void main(String[] args) {


        LibraryAPI api = new LibraryAPIImpl();

        User user = new User("Paweł","Cwik","32131212");

        BookConnector connector = new BookConnector(user,api);

        connector.checkAviability("Harry Potter i Zakon Feniksa");

    }

}
