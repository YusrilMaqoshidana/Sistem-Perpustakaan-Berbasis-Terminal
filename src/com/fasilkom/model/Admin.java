package com.fasilkom.model;

import com.fasilkom.mediator.LoanMediator;
import com.fasilkom.observer.Subject;
import com.fasilkom.observer.Observer;
import com.fasilkom.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User implements Subject {
    private final int id;
    private final String name;
    private final String email;
    private final String password;
    private final List<Observer> observers;
    private final BookRepository bookRepository;

    public Admin(AdminBuilder builder) {
        super(builder.mediator, builder.name); // Memanggil konstruktor parent
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.observers = new ArrayList<>();
        this.bookRepository = new BookRepository();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);  // Mengirim notifikasi ke semua mahasiswa yang terdaftar
        }
    }

    public void addBook(Book book) {
        bookRepository.addBook(book);  // Memanggil metode pada BookRepository untuk menambahkan buku
        System.out.println("Admin " + name + " menambahkan buku: " + book.getTitle());
        notifyObservers("Buku baru ditambahkan: " + book.getTitle());  // Mengirim notifikasi
    }

    @Override
    public void send(String message) {
        System.out.println("Admin " + name + ": Sending Message = " + message);
        // Implementasi pengiriman pesan (jika diperlukan)
    }

    @Override
    public void receive(String message) {
        System.out.println("Admin " + name + ": Received Message = " + message);
        // Implementasi penerimaan pesan (jika diperlukan)
    }

    // Inner Builder class
    public static class AdminBuilder {
        private int id;
        private String name;
        private String email;
        private String password;
        private LoanMediator mediator; // Tambahkan mediator di builder

        public AdminBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public AdminBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AdminBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public AdminBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public AdminBuilder setMediator(LoanMediator mediator) {
            this.mediator = mediator;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }
}
