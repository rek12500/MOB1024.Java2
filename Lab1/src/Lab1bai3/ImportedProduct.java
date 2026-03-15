package Lab1bai3;

class ImportedProduct extends Product {
    private double importTaxRate;
    private double shippingFee;

    public ImportedProduct(String id, String name, double basePrice, double importTaxRate, double shippingFee) {
        super(id, name, basePrice);
        setImportTaxRate(importTaxRate);
        setShippingFee(shippingFee);
    }

    public void setImportTaxRate(double importTaxRate) {
        if (importTaxRate < 0 || importTaxRate > 1) {
            throw new IllegalArgumentException("Invalid tax rate");
        }
        this.importTaxRate = importTaxRate;
    }

    public void setShippingFee(double shippingFee) {
        if (shippingFee < 0) {
            throw new IllegalArgumentException("Invalid shipping fee");
        }
        this.shippingFee = shippingFee;
    }

    public double finalPrice() {
        return getBasePrice() + getBasePrice() * importTaxRate + shippingFee;
    }

    public String toString() {
        return getId() + " - " + getName() + " - " + finalPrice();
    }
}
