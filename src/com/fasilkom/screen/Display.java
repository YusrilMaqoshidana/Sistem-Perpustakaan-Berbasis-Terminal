package com.fasilkom.screen;

import com.fasilkom.database.DatabaseLibrary;

public interface Display {
    DatabaseLibrary database = DatabaseLibrary.getInstance();
    public void read();
}
