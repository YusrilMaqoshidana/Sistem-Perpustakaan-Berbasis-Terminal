package com.fasilkom.observer;


public interface Subject {
    void registerObserver(Observer observer);   // Untuk mendaftarkan observer (Mahasiswa)
    void removeObserver(Observer observer);     // Untuk menghapus observer
    void notifyObservers(String message);       // Untuk mengirim notifikasi ke observer
}

