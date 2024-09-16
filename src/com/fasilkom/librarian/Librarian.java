package com.fasilkom.librarian;

import com.fasilkom.book.Book;

public class Librarian {
    private String name;
    private String email;
    private String password;
    private Boolean isLogin;

    public Librarian(String name, String email, String password, Boolean isLogin){
        this.name = name;
        this.email = email;
        this.password = password;
        this.isLogin = isLogin;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public Boolean getIsLogin(){
        return isLogin;
    }
}
