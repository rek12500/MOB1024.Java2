package Lab1bai3;

class Product {
    private String id;
    private String name;
    private double basePrice;

    public Product(String id, String name, double basePrice) {
        setId(id);
        this.name = name;
        setBasePrice(basePrice);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid id");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice < 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        this.basePrice = basePrice;
    }

    public double finalPrice() {
        return basePrice;
    }

    public String toString() {
        return id + " - " + name + " - " + finalPrice();
    }
}

