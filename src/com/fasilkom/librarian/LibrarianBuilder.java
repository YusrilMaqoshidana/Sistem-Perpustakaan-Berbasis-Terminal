package com.fasilkom.librarian;

public class LibrarianBuilder {
    private String name = "Budi";
    private String email = "budi@gmail.com";
    private String password = "admin";
    private Boolean isLogin = false;

    public LibrarianBuilder(){

    }
    public LibrarianBuilder setName(String name){
        this.name = name;
        return this;
    }

    public LibrarianBuilder setEmail(String email){
        this.email = email;
        return this;
    }

    public LibrarianBuilder setPassword(String password){
        this.password = password;
        return this;
    }
    public LibrarianBuilder setIsLogin(Boolean isLogin){
        this.isLogin = isLogin;
        return this;
    }
    public Librarian build(){
        return new Librarian(name, email, password, isLogin);
    }
}
