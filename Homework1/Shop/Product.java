package Shop;

import java.util.Comparator;
import java.util.Iterator;

public class Product implements Comparable<Product>, Comparator<Product> {
    private Integer cost; // Стоимость продукта
    private String title; // Название

    public Product(Integer cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title + ": " + cost;
    }

    @Override
    public int compareTo(Product o) {
        return cost.compareTo(o.cost);
    }

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getCost(), o2.getCost());
    }
}