package org.example.entities;

public class Individual extends Payer {

    private double healthExpenditure;

    public Individual() {
        super();
    }

    public Individual(String name, Double annualIncome, double healthExpenditure) {
        super(name, annualIncome);
        this.healthExpenditure = healthExpenditure;
    }


    @Override
    public double tax() {
        if (getAnnualIncome() <= 20000) {
            return (getAnnualIncome() * 0.15) - (healthExpenditure * 0.50);
        }
        else {
            return (getAnnualIncome() * 0.25) - (healthExpenditure * 0.50);
        }
    }

    public double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

}
