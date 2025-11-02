package entities;

public class Company extends TaxPayer {
    private Integer employees;

    public Company() {
    }

    public Company(String name, Double annualIncome, Integer employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public Double tax() {
        return (this.employees > 10)
            ? getAnnualIncome() * 0.14
            : getAnnualIncome() * 0.16;
        }
    }

