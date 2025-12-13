package com.myapp.model;

import java.time.LocalDate;

public class MonthlySub extends Subscription {

    public MonthlySub(String name, double price, LocalDate dueDate) {
        super(name, price, "Bulanan", dueDate);
    }

    @Override
    public double calculateAnnualCost() {
        return getPrice() * 12;
    }
}
