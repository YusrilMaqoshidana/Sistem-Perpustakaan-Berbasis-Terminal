package com.fasilkom.screen;

import com.fasilkom.student.Student;

import java.util.Scanner;

public class DisplayStudent implements Display {

    @Override
    public void read() {
        database.displayBooks();
    }

    public void display(Student student) {
        Scanner scanner = new Scanner(System.in);

        String choice = "";
        while (!choice.equals("0")) {
            System.out.println();
            System.out.println("====== Daftar Buku ======");
            System.out.println("Halo "+ student.getName());
            System.out.println("0. Kembali");
            read();
            System.out.print("Masukkan pilihan: ");
            choice = scanner.nextLine();
            if (!choice.equals("0")) {
                try {
                    int number = Integer.parseInt(choice);
                    database.displayBookDetails(number);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Input tidak valid. Silakan coba lagi.");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Error: Nomor buku melebihi jumlah buku yang ada di daftar.");
                }
            }
        }
    }
}
