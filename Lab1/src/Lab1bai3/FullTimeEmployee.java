package Lab1bai3;

class FullTimeEmployee extends Employee {
    private double bonus;
    private double penalty;

    public FullTimeEmployee(String id, String name, double basicSalary, double bonus, double penalty) {
        super(id, name, basicSalary);
        setBonus(bonus);
        setPenalty(penalty);
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException("Invalid bonus");
        }
        this.bonus = bonus;
    }

    public void setPenalty(double penalty) {
        if (penalty < 0) {
            throw new IllegalArgumentException("Invalid penalty");
        }
        this.penalty = penalty;
    }

    public double income() {
        return getBasicSalary() + bonus - penalty;
    }
}
