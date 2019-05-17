package com.burger.model;

import javax.persistence.*;

@Entity
@Table(name = "Admin")
public class ListProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int id_menu;
    private float price;
    private int position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
