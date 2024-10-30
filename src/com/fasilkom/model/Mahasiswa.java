package com.fasilkom.model;

import com.fasilkom.mediator.LoanMediator;
import com.fasilkom.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa extends User implements Observer {
    private final int id;
    private final String name;
    private final String email;
    private final String password;
    private final String prodi;

    private Mahasiswa(MahasiswaBuilder builder) {
        super(builder.mediator, builder.name);
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.prodi = builder.prodi;
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

    public String getProdi() {
        return prodi;
    }

    @Override
    public void update(String message) {
        System.out.println("Mahasiswa " + name + " menerima notifikasi: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " (Mahasiswa): Sending Message = " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " (Mahasiswa): Received Message = " + message);
    }

    // Inner Builder class
    public static class MahasiswaBuilder {
        private int id;
        private String name;
        private String email;
        private String password;
        private String prodi;
        private LoanMediator mediator;


        public MahasiswaBuilder setMediator(LoanMediator mediator) {
            this.mediator = mediator;
            return this;
        }
        public MahasiswaBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public MahasiswaBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MahasiswaBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public MahasiswaBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public MahasiswaBuilder setProdi(String prodi) {
            this.prodi = prodi;
            return this;
        }

        public Mahasiswa build() {
            return new Mahasiswa(this);
        }
    }
}
