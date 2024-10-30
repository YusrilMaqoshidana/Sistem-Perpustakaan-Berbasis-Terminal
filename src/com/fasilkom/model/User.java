package com.fasilkom.model;

import com.fasilkom.mediator.LoanMediator;

public abstract class User {
    protected LoanMediator mediator;
    protected String name;

    public User(LoanMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}

