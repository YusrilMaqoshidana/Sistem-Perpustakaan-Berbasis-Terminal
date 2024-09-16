package com.fasilkom.book;

public class BookBuilder {
    private String name = "";
    private String description ="";
    private Integer quantity = 0;
    private Double rating = 5.0;
    private Integer reviewer = 0;
    private String genre = "";

    public BookBuilder() {}

    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public BookBuilder setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public BookBuilder setRating(Double rating, Integer reviewer) {
        this.rating = rating;
        this.reviewer = reviewer;
        return this;
    }

    public BookBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public Book build() {
        return new Book(name, description, quantity, rating, reviewer, genre);
    }
}
