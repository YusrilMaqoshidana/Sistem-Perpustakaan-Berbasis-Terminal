package com.fasilkom.mediator;

import com.fasilkom.model.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomImpl implements LoanMediator {
    private List<User> users;

    public ChatRoomImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
