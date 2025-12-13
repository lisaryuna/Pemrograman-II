package com.myapp.repository;

import com.myapp.model.Subscription;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataRepo {
    private static final ObservableList<Subscription> SUBSCRIPTION_LIST = FXCollections.observableArrayList();

    public static ObservableList<Subscription> getSubcriptionList() {
        return SUBSCRIPTION_LIST;
    }

    public static void addSubscription(Subscription subscription) {
        SUBSCRIPTION_LIST.add(subscription);
    }

    public static void deleteSubscription(Subscription subscription) {
        SUBSCRIPTION_LIST.remove(subscription);
    }
}
