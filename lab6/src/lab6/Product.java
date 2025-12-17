package lab6;

/**
 * Клас, що представляє товари на складі
 */
class Product implements Comparable<Product> {
    private String name;
    private double price;

    /**
     * Конструктор створює новий товар
     * @param name назва товару
     * @param price ціна товару
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + " (ціна: " + price + " грн)";
    }
}