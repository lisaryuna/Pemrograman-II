package com.myapp.model;

import java.time.LocalDate;

public abstract class Subscription {
    private String name;
    private double price;
    private String type;
    private LocalDate dueDate;

    public Subscription(String name, double price, String type, LocalDate dueDate) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public abstract double calculateAnnualCost();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
