package com.fasilkom.repository;

import com.fasilkom.database.DatabaseLibrary;
import com.fasilkom.model.Book;

import java.util.List;

public class BookRepository{
    private final DatabaseLibrary instance;

    public BookRepository() {
        instance = DatabaseLibrary.getInstance();
    }

    public List<Book> getAllBooks() {
        return instance.getListBooks();
    }

    public void updateBookById(int bookId, Book updatedBook) {
        List<Book> books = instance.getListBooks();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                books.set(i, updatedBook);
                break;
            }
        }
    }

    public void addBook(Book book) {
        instance.getListBooks().add(book);  // Menambahkan buku baru ke list
    }
}
