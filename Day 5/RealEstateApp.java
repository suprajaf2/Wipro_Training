package day5;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;

class Property2 {
    private String address;
    private double price;
    private int bedrooms;

    public Property2(String addr, double price, int beds) {
        this.address = addr;
        this.price = price;
        this.bedrooms = beds;
    }
    public String getAddress() { return address; }
    public double getPrice() { return price; }
    public int getBedrooms() { return bedrooms; }

    @Override
    public String toString() {
        return String.format("Property[address='%s', price=%.2f, bedrooms=%d]",
                             address, price, bedrooms);
    }
}

public class RealEstateApp {
    static List<Property2> properties = new ArrayList<>();

    public static void main(String[] args) {
        properties.add(new Property2("123 Main St", 250_000, 3));
        properties.add(new Property2("456 Oak Ave", 150_000, 2));
        properties.add(new Property2("789 Pine Rd", 500_000, 4));
        properties.add(new Property2("321 Cedar Ln", 200_000, 3));

        // 1. Filter properties under $300k
        filterAndAct(p -> p.getPrice() < 300_000,
                     p -> System.out.println("Affordable: " + p));

        System.out.println();

        // 2. Filter 3‑bedroom properties for showing
        filterAndAct(p -> p.getBedrooms() == 3,
                     p -> System.out.println("Schedule showing: " + p));
    }

    static void filterAndAct(Predicate<Property2> tester, Consumer<Property2> action) {
        for (Property2 p : properties) {
            if (tester.test(p)) {
                action.accept(p);
            }
        }
    }
}
