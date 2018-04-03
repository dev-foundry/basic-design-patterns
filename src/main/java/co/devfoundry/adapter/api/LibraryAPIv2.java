package co.devfoundry.adapter.api;

import java.time.LocalDate;

public interface LibraryAPIv2 {

    int numberOfAviableCopies(String bookTitle);

    LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth);

    boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth);

}
