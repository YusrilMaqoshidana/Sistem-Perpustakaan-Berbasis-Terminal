package com.fasilkom.database;

import com.fasilkom.book.Book;
import com.fasilkom.book.BookBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseLibrary {
    // Instance tunggal dari DatabaseService (static)
    private static DatabaseLibrary instance;

    // List untuk menyimpan buku yang ditambahkan
    private List<Book> books;

    // Private constructor untuk mencegah pembuatan objek dari luar
    private DatabaseLibrary() {
        books = new ArrayList<>();
        books.add(new BookBuilder()
                .setName("Clean Code")
                .setRating(5.0, 20)
                .setDescription("A Handbook of Agile Software Craftsmanship")
                .setGenre("Programming")
                .build());

        books.add(new BookBuilder()
                .setName("Design Patterns")

                .setRating(4.8, 16)
                .setDescription("Elements of Reusable Object-Oriented Software")
                .setGenre("Software Engineering")
                .build());

        books.add(new BookBuilder()
                .setName("Refactoring")
                .setRating(4.7,11)
                .setDescription("Improving the Design of Existing Code")
                .setGenre("Programming")
                .build());

        books.add(new BookBuilder()
                .setName("Effective Java")

                .setRating(4.9,10)
                .setDescription("Best Practices for the Java Platform")
                .setGenre("Programming")
                .build());

        books.add(new BookBuilder()
                .setName("The Pragmatic Programmer")
                .setRating(4.6, 10)
                .setDescription("Your Journey to Mastery")
                .setGenre("Software Development")
                .build());

    }

    // Metode untuk mendapatkan instance tunggal dari DatabaseLibrary
    public static DatabaseLibrary getInstance() {
        if (instance == null) {
            instance = new DatabaseLibrary();  // Membuat instance hanya sekali
        }
        return instance;
    }

    // Metode untuk menambahkan buku
    public void addBook(Book book) {
        Scanner scanner = new Scanner(System.in);
        books.add(book);  // Menambahkan buku ke list
        System.out.println();
        System.out.println("Buku berhasil ditambahkan: " + book.getName());
        System.out.println();
        String kosong = scanner.nextLine();
    }

    // Metode untuk menampilkan semua buku yang ada di database
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Tidak ada buku.");
        } else {
            int counter = 1;
            for (Book book : books) {
                System.out.println(counter + ". " + book.getName() + "-> Rating: " + book.getRating());  // Menampilkan angka dan nama buku
                counter++;  // Menampilkan detail buku menggunakan toString() dari kelas Book
            }
        }
    }

    public void displayBookDetails(int number) {
            Scanner scanner = new Scanner(System.in);
        if (number > 0 && number <= books.size()) {
            // Mengambil buku berdasarkan nomor yang dipilih
            Book selectedBook = books.get(number - 1);
            System.out.println();
            System.out.println("====== Detail Buku ======");
            // Menampilkan detail buku
            System.out.println();
            System.out.println("Nama buku: " + selectedBook.getName());
            System.out.println("Rating buku: " + selectedBook.getRating());
            System.out.println("Deskripsi: " + selectedBook.getDescription());
            System.out.println("Jumlah buku tersedia: " + selectedBook.getDescription());
            System.out.print("");
            String kosong = scanner.nextLine();
        } else {
            System.out.println();
            System.out.println("Tidak ada buku nomer " + number + ".");
            System.out.println();
            String kosong = scanner.nextLine();
        }
    }

}
