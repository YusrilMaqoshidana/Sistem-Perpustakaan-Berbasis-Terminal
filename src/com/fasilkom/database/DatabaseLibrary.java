package com.fasilkom.database;

import com.fasilkom.model.Book;
import com.fasilkom.model.Book.BookBuilder;

import java.util.ArrayList;
import java.util.List;

public class DatabaseLibrary {
    private static DatabaseLibrary instance;
    private final List<Book> listBooks;

    public static DatabaseLibrary getInstance() {
        if (instance == null) {
            instance = new DatabaseLibrary();
        }
        return instance;
    }

    private DatabaseLibrary() {
        listBooks = new ArrayList<>();

        // Data dummy buku
        listBooks.add(new BookBuilder()
                .setTitle("Clean Code")
                .setAuthor("Robert C. Martin")
                .setPublisher("Prentice Hall")
                .setGenre("Programming")
                .setPublicationYear(2008)
                .setIsAvailable(true)
                .build());

        listBooks.add(new BookBuilder()
                .setTitle("Design Patterns")
                .setAuthor("Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides")
                .setPublisher("Addison-Wesley")
                .setGenre("Software Engineering")
                .setPublicationYear(1994)
                .setIsAvailable(true)
                .build());

        listBooks.add(new BookBuilder()
                .setTitle("Refactoring")
                .setAuthor("Martin Fowler")
                .setPublisher("Addison-Wesley")
                .setGenre("Programming")
                .setPublicationYear(1999)
                .setIsAvailable(true)
                .build());

        listBooks.add(new BookBuilder()
                .setTitle("Effective Java")
                .setAuthor("Joshua Bloch")
                .setPublisher("Addison-Wesley")
                .setGenre("Programming")
                .setPublicationYear(2008)
                .setIsAvailable(true)
                .build());

        listBooks.add(new BookBuilder()
                .setTitle("The Pragmatic Programmer")
                .setAuthor("Andrew Hunt, David Thomas")
                .setPublisher("Addison-Wesley")
                .setGenre("Software Development")
                .setPublicationYear(1999)
                .setIsAvailable(true)
                .build());

    }

    public List<Book> getListBooks() {
        return listBooks;
    }
}
