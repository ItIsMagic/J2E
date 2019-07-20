package com.burger.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Command")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Float total;
    private int done;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;

    @ManyToMany
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Set<Product> products;

    @ManyToMany
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Set<Menu> menus;

    @Transient
    private Currency currency;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
