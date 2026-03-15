package Lab1bai3;

class PartTimeEmployee extends Employee {
    private double workingHours;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double basicSalary, double workingHours, double hourlyRate) {
        super(id, name, basicSalary);
        setWorkingHours(workingHours);
        setHourlyRate(hourlyRate);
    }

    public void setWorkingHours(double workingHours) {
        if (workingHours < 0) {
            throw new IllegalArgumentException("Invalid hours");
        }
        this.workingHours = workingHours;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Invalid rate");
        }
        this.hourlyRate = hourlyRate;
    }

    public double income() {
        return workingHours * hourlyRate;
    }
}
