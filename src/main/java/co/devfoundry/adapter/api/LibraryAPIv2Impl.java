package co.devfoundry.adapter.api;

import java.time.LocalDate;

public class LibraryAPIv2Impl {

    int numberOfAviableCopies(String bookTitle) {
        System.out.println("Sprawdzam dostepnosc " + bookTitle);
        return 3;

    }

    LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Sprawdzam date zwrotu dla " + bookTitle);
        return LocalDate.now();
    }

    boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Rezerwuje " + bookTitle);
        return true;
    }

}
