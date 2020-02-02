package adapterHomework.api;

import adapterHomework.User;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPIv2, LibraryAPI {

    LibraryAPI libraryAPI;
    LibraryAPIv2 libraryAPIv2;
    User user;

    public APIAdapter(LibraryAPI libraryAPI, LibraryAPIv2 libraryAPIv2) {
        this.libraryAPI = libraryAPI;
        this.libraryAPIv2 = libraryAPIv2;
    }


    @Override
    public boolean isAviable(String bookTitle) {
        return libraryAPIv2.reserve(bookTitle,user.getFirstName(),user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPIv2.dueDate(bookTitle,user.getFirstName(),user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPIv2.reserve(bookTitle,user.getFirstName(),user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public int numberOfAviableCopies(String bookTitle) {
        if(libraryAPI.reserve(bookTitle,user.getPESEL())==false){
            return 0;
        }
        return 0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        return libraryAPI.dueDate(bookTitle,user.getPESEL());
    }

    @Override
    public boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        return libraryAPI.reserve(bookTitle,user.getPESEL());
    }
}
