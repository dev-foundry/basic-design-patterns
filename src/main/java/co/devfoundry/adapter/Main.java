package co.devfoundry.adapter;

import co.devfoundry.adapter.api.LibraryAPI;
import co.devfoundry.adapter.api.LibraryAPIImpl;
import co.devfoundry.adapter.api.LibraryAPIv2;
import co.devfoundry.adapter.api.LibraryAPIv2Impl;

public class Main {

    public static void main(String[] args) {

        User user = new User("Paweł","Cwik","32131212");

        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();

        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);

        BookConnector connector = new BookConnector(user,apiAdapter);

        connector.checkAviability("Harry Potter i Zakon Feniksa");

    }

}
