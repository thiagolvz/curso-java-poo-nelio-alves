package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities2.Employee;

public class S10Listas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employees, id)) {
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine(); // limpar buffer

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            employees.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int empId = sc.nextInt();

        // Buscar funcionário usando Stream
        Employee emp = employees.stream()
                .filter(x -> x.getId() == empId)
                .findFirst()
                .orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }

    // Método para checar ID duplicado
    public static boolean hasId(List<Employee> list, int id) {
        return list.stream().anyMatch(x -> x.getId() == id);
    }
}
