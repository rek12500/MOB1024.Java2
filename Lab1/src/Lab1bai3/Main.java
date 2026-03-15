package Lab1bai3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("P01", "Laptop Dell", 1500));
        products.add(new Product("P02", "Mouse Logitech", 25));
        products.add(new Product("P03", "Keyboard Razer", 120));
        products.add(new ImportedProduct("P04", "iPhone 15", 1000, 0.1, 50));
        products.add(new ImportedProduct("P05", "Samsung S24", 900, 0.08, 40));

        try {
            products.add(new Product("", "Laptop HP", 1200));
        } catch (Exception e) {
            products.add(new Product("P06", "Laptop HP", 1200));
        }

        System.out.println("Product List:");
        for (Product p : products) {
            System.out.println(p);
        }

        Product maxProduct = products.get(0);
        for (Product p : products) {
            if (p.finalPrice() > maxProduct.finalPrice()) {
                maxProduct = p;
            }
        }

        System.out.println("Highest price product: " + maxProduct);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("E01", "An", 1000, 200, 50));
        employees.add(new FullTimeEmployee("E02", "Binh", 1200, 300, 0));
        employees.add(new PartTimeEmployee("E03", "Cuong", 0, 80, 10));
        employees.add(new PartTimeEmployee("E04", "Dung", 0, 60, 12));
        employees.add(new Employee("E05", "Hanh", 900));

        try {
            employees.add(new FullTimeEmployee("", "Lan", 1000, 200, 50));
        } catch (Exception e) {
            employees.add(new FullTimeEmployee("E06", "Lan", 1000, 200, 50));
        }

        System.out.println("\nEmployee List:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Employee maxEmployee = employees.get(0);
        for (Employee e : employees) {
            if (e.income() > maxEmployee.income()) {
                maxEmployee = e;
            }
        }

        System.out.println("Highest income employee: " + maxEmployee);
    }
}
