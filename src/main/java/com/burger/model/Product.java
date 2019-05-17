package com.burger.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Table(name = "Product")

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private float price;
    private boolean highlight;
    private int category;
    private boolean available;

    public Product() {
    }

    public Product(int id, String name, float price, boolean highlight, int category, boolean available) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.highlight = highlight;
        this.category = category;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isHighlight() {
        return highlight;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
