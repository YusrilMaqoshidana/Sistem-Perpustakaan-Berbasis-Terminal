package com.fasilkom.screen;

import com.fasilkom.book.Book;
import com.fasilkom.book.BookBuilder;

import java.util.Scanner;

public class DisplayAdmin implements Display {

    @Override
    public void read() {
        database.displayBooks();
    }

    public void create(BookBuilder bookBuilder) {
        // Memanggil build() untuk membuat objek Book
        Book newBook = bookBuilder.build();
        // Menambahkan buku ke database
        database.addBook(newBook);
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        String menuOption = "";
        while (!menuOption.equals("0")) {
            System.out.println();
            System.out.println("====== Menu ======");
            System.out.println("1. Daftar Buku");
            System.out.println("2. Tambah Buku");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            menuOption = scanner.nextLine();
            if (menuOption.equals("1")) {
                System.out.println("====== Daftar Buku ======");
                System.out.println("0. Kembali");
                read();
                System.out.print("Masukkan pilihan: ");
                String detail = scanner.nextLine();
                try {
                    int number = Integer.parseInt(detail);
                    if (number != 0) {
                        database.displayBookDetails(number);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Input tidak valid. Silakan coba lagi.");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Error: Nomor buku melebihi jumlah buku yang ada di daftar.");
                }
            } else if (menuOption.equals("2")) {
                System.out.println();
                System.out.println("====== Tambah Buku ======");
                System.out.print("Masukkan nama buku: ");
                String name = scanner.nextLine();
                System.out.print("Masukkan deskripsi buku: ");
                String description = scanner.nextLine();
                System.out.print("Masukkan jumlah buku: ");
                String quanty = scanner.nextLine();
                int quantity = Integer.parseInt(quanty);
                System.out.print("Masukkan genre buku: ");
                String genre = scanner.nextLine();
                create(new BookBuilder().setName(name).setDescription(description).setQuantity(quantity).setGenre(genre));
            } else if (!menuOption.equals("0")) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
