package Lab1bai3;

class Employee {
    private String id;
    private String name;
    private double basicSalary;

    public Employee(String id, String name, double basicSalary) {
        setId(id);
        this.name = name;
        setBasicSalary(basicSalary);
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

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary < 0) {
            throw new IllegalArgumentException("Invalid salary");
        }
        this.basicSalary = basicSalary;
    }

    public double income() {
        return basicSalary;
    }

    public String toString() {
        return id + " - " + name + " - " + income();
    }
}
