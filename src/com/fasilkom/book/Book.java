package com.fasilkom.book;

public class Book {
    private String name;
    private String description;
    private Integer quantity;
    private Double rating;
    private Integer reviewer;
    private String genre;

    // Constructor Book yang menerima nilai dari builder
    public Book(String name, String description, Integer quantity, Double rating, Integer reviewer, String genre) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.rating = rating;
        this.reviewer = reviewer;
        this.genre = genre;
    }

    // Getter dan toString untuk menampilkan info buku
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getRating() {
        return rating;
    }

    public Integer getReviewer() {
        return reviewer;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", rating=" + rating +
                ", reviewer=" + reviewer +
                ", genre='" + genre + '\'' +
                '}';
    }
}

