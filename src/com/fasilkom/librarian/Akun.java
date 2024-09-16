package com.fasilkom.librarian;

public class Akun {
    public Boolean login(String email, String password){
        Librarian admin = new LibrarianBuilder().build();

        if (admin.getEmail().equals(email) && admin.getPassword().equals(password)) {
            admin = new LibrarianBuilder().setIsLogin(true).build();
        } else {
            admin = new LibrarianBuilder().setIsLogin(false).build();
        }
        return admin.getIsLogin();
    }
}
