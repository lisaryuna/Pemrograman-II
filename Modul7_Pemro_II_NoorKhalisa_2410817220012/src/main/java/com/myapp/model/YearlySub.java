package com.myapp.model;

import java.time.LocalDate;

public class YearlySub extends Subscription {

    public YearlySub(String name, double price, LocalDate dueDate) {
        super(name, price, "Tahunan", dueDate);
    }

    @Override
    public double calculateAnnualCost() {
        return getPrice() * 1;
    }
}
