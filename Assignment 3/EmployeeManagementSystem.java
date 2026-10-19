import java.util.*;
import java.io.*;

class Employee {
    int id;
    String name, department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Save and Exit");
            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) {
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = Double.parseDouble(sc.nextLine());

                    if (id <= 0 || name.isBlank() || dept.isBlank()
                            || salary < 0
                            || Double.isInfinite(salary)
                            || Double.isNaN(salary)) {
                        System.out.println("Invalid details!");
                        continue;
                    }

                    list.add(new Employee(id, name, dept, salary));
                    System.out.println("Employee added.");

                } else if (choice == 2) {
                    for (Employee e : list) {
                        System.out.println(e.id + " " + e.name + " "
                                + e.department + " " + e.salary);
                    }

                } else if (choice == 3) {
                    FileWriter fw = new FileWriter("employees.txt");

                    for (Employee e : list) {
                        fw.write(e.id + "," + e.name + ","
                                + e.department + "," + e.salary + "\n");
                    }

                    fw.close();
                    System.out.println("Data saved successfully.");
                    sc.close();
                    break;

                } else {
                    System.out.println("Invalid choice!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers.");
            } catch (IOException e) {
                System.out.println("File error!");
            }
        }
    }
}
