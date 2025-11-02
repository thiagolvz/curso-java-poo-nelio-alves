package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class S13Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                Individual individual = new Individual(name, annualIncome, healthExpenditures);
                list.add(individual);

            } else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();

                Company company = new Company(name, annualIncome, employees);
                list.add(company);
            }

        }
        System.out.println();

        System.out.println("TAXES PAID: ");

        double sum = 0.0;
        for (TaxPayer p : list) {
            System.out.println(p);
            sum += p.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);

        sc.close();
    }
}
