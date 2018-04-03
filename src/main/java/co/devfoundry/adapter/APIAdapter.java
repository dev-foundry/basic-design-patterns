package co.devfoundry.adapter;

import co.devfoundry.adapter.api.LibraryAPI;
import co.devfoundry.adapter.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI{


    private final User user;
    private final LibraryAPIv2 libraryAPIv2;

    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.user = user;
        this.libraryAPIv2 = libraryAPIv2;
    }

    @Override
    public boolean isAviable(String bookTitle) {
        return libraryAPIv2.numberOfAviableCopies(bookTitle)>0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPIv2.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPIv2.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}
