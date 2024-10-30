package com.fasilkom.mediator;

import com.fasilkom.model.User;


public interface LoanMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
