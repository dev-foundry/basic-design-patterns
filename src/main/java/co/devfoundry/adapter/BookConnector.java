package co.devfoundry.adapter;

import co.devfoundry.adapter.api.LibraryAPI;

import java.time.LocalDate;

public class BookConnector {

    private final User user;
    private final LibraryAPI api;

    public BookConnector(User user, LibraryAPI api) {
        this.user = user;
        this.api = api;
    }

    public boolean checkAviability(String title) {
        return api.isAviable(title);
    }

    public boolean reserve(String title, User user) {
        return api.reserve(title,user.getPESEL());
    }

    public LocalDate whenToReturn(String title, User user) {
        return api.dueDate(title,user.getPESEL());
    }

}
