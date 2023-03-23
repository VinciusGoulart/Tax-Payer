package org.example.entities;

public abstract class Payer {

    private String name;
    private Double annualIncome;

    public Payer() {

    }

    public Payer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract double tax();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    @Override
    public String toString() {
        return "Name: " + name + String.format(" $ %.2f", tax());
    }

}
