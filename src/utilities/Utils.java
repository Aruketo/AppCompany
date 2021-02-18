package utilities;

import workers.Employee;
import java.util.*;
public class Utils
{
    private List<Employee> employees = new ArrayList<>();
    private Map<String, Employee> oneEmployee = new HashMap<>();
    Scanner myScanner = new Scanner(System.in);
    public static void viewOptions()
    {
        System.out.println("---------------------------------");
        System.out.println("Witaj w mojej aplikacji!");
        System.out.println("Wybierz interesującą cię opcję.");
        System.out.println("");
        System.out.println("1. Dodaj pracowników.");
        System.out.println("2. Wyświetl pracowników.");
        System.out.println("3. Wyszukaj pracownika.");
        System.out.println("4. Usuń pracownika.");
        System.out.println("5. Wyjdź z aplikacji.");
        System.out.println("---------------------------------");
    }

    public void addEmployee()
    {
        System.out.println("Podaj imię pracownika:");
        String name = myScanner.next();

        System.out.println("Podaj nazwisko pracownika:");
        String surName = myScanner.next();

        System.out.println("Podaj wiek pracownika:");
        Age age = new Age(myScanner.nextInt());


        System.out.println("Podaj wynagrodzenie pracownika w pln:");
        double salary = myScanner.nextDouble();

        Employee employee = new Employee(name, surName, age, salary);
        employees.add(employee);
        oneEmployee.put(surName, employee);
    }

    public void showsEmployees()
    {
        for (Map.Entry<String, Employee> entry: oneEmployee.entrySet()) {
            entry.getValue().showInformation();
        }
    }

    public void showEmployee()
    {
        System.out.println("Podaj nazwisko pracownika, którego szukasz: ");
        String surName = myScanner.next();
        Employee employee = oneEmployee.get(surName);

        if(employee != null)
        {
            employee.showInformation();
        }if(employee == null) System.out.println("Pracownik o takim nazwisku nie istniej lub został usunięty.");
    }

    public void deleteEmployee()
    {
        System.out.println("Podaj nazwisko pracownika, którego chcesz usunąć: ");
        String surName = myScanner.next();
        Employee employee = oneEmployee.get(surName);
        oneEmployee.remove(surName, employee);

    }

}
