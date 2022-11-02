import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {

        // booleans to check for errors
        boolean first_try = true;
        boolean retry = false;

        while(first_try || retry) {
            first_try = false;
            try {
                // prompt the user to input values for employee 1
                Scanner sc = new Scanner(System.in);
                System.out.println("Employee 1");
                System.out.print("Enter employee name: ");
                String name1 = sc.nextLine();
                System.out.print("Enter employee id: ");
                String id1 = sc.nextLine();
                System.out.print("Enter employee salary: ");
                double salary1 = sc.nextDouble();
                System.out.print("Enter date (year) of hire: ");
                int year_of_hire1 = sc.nextInt();

                // create employee object e1 using these instance variables
                Person.Employee e1 = new Person.Employee(name1, id1, salary1, year_of_hire1);

                // print output of instance variables for employee 1
                e1.writeOutput();

                // ask for the new name and salary of employee 1
                System.out.print("Enter new name for employee #1: ");
                sc.nextLine();
                String new_name = sc.nextLine();
                System.out.print("Enter new salary for employee #1: ");
                double new_salary = sc.nextDouble();

                e1.setName(new_name);
                e1.setSalary(new_salary);

                // print new values for employee 1
                e1.writeOutput();

                // prompt user for input values for employee #2
                System.out.println("\nEmployee 2");
                sc.nextLine();
                System.out.print("Enter employee name: ");
                String name2 = sc.nextLine();
                System.out.print("Enter employee id: ");
                String id2 = sc.nextLine();
                System.out.print("Enter employee salary: ");
                double salary2 = sc.nextDouble();
                System.out.print("Enter date (year) of hire: ");
                int year_of_hire2 = sc.nextInt();

                // create employee object e2 using these values
                Person.Employee e2 = new Person.Employee(name2, id2, salary2, year_of_hire2);

                // redisplay the instance variables for e1 & e2
                e1.writeOutput();
                e2.writeOutput();

                // compare and print result
                if (e1.compareEmployees(e2)) {
                    System.out.println("\nThey are the same employee");
                } else {
                    System.out.println("\nThey are not the same employees");
                }
                retry = false;
            } catch (Exception e) {
                System.out.println("\nError: " + e + "\nPlease try again...\n");
                retry = true;
            }
        }
    }
}
