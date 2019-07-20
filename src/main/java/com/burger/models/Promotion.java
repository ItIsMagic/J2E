package com.burger.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Promotion")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String prerequisite;
    private int available;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate start_date;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate end_date;

//    @OneToMany
//    private List<Product> products;
//
//    @OneToMany(mappedBy = "menu_promotion", cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private Set<Menu> menus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }
}
