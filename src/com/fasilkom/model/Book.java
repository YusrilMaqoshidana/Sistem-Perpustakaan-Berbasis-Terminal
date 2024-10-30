package com.fasilkom.model;

public class Book {
    private final int bookId;
    private final String title;
    private final String author;
    private final String publisher;
    private final String genre;
    private final int publicationYear;
    private final Boolean isAvailable;

    public Book(int id, String title, String author, String publisher, String genre, int publicationYear, Boolean isAvailable) {
        this.bookId = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() { // Corrected 'getPubliser' to 'getPublisher'
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public static class BookBuilder {
        private int bookId = 0;
        private String title = "";
        private String author = "";
        private String publisher = ""; // Added publisher initialization
        private String genre = "";
        private int publicationYear = 0;
        private Boolean isAvailable = false;

        public BookBuilder setBookId(int bookId) {
            this.bookId = bookId;
            return this;
        }

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setPublisher(String publisher) { // Added setter for publisher
            this.publisher = publisher;
            return this;
        }

        public BookBuilder setPublicationYear(int publicationYear) {
            this.publicationYear = publicationYear;
            return this;
        }

        public BookBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public Book build() {
            return new Book(bookId, title, author, publisher, genre, publicationYear, isAvailable);
        }
    }
}
