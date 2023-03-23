package org.example.entities;

public class Company extends Payer {

    private Integer employee;

    public Company() {
        super();
    }

    public Company(String name, Double annualIncome, Integer employee) {
        super(name, annualIncome);
        this.employee = employee;
    }

    @Override
    public double tax() {
        if (employee > 10) {
            return getAnnualIncome() * 0.14;
        } else return getAnnualIncome() * 0.16;
    }

    public Integer getEmployee() {
        return employee;
    }

    public void setEmployee(Integer employee) {
        this.employee = employee;
    }

}
