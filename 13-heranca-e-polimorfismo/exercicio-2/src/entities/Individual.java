package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double basicTax = (getAnnualIncome() < 20000.0)
                ? getAnnualIncome() * 0.15
                : getAnnualIncome() * 0.25;
        basicTax -= getHealthExpenditures() * 0.50;
        return (basicTax < 0.0) ? 0.0 : basicTax;
    }
}
