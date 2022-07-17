package Dealer;

import Car.StockCars;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private final String name;

    public Dealer(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "name='" + name + '\'' +
                '}';
    }
}
