import java.text.DecimalFormat;
public class Person {
    private static final DecimalFormat df = new DecimalFormat("0.0");
// parent class

    // declare name variable
    String name;

    // constructor to initialize object name
    Person(String name) {
        this.name = name;
    }

    // get method to access name
    public String getName() {
        return name;
    }

    // set method to reset name variable for employee 1
    public void setName(String new_name) {
        this.name = new_name;
    }
    // child class of Person
    public static class Employee extends Person {

        // data members for the class
        String id; double salary; int year_of_hire;

        // constructor to initialize objects for employee
        Employee(String name, String id, double salary, int year_of_hire) {
            super(name);
            this.id = id;
            this.salary = salary;
            this.year_of_hire = year_of_hire;

        }

        // accessor methods
        public String getId() {return id;}
        public double getSalary() {return salary;}
        public int getYear_of_hire() {return year_of_hire;}
        public String getName() {return super.getName();}


        // mutator methods
        public void setId(String new_id) {this.id = new_id;}
        public void setSalary(double new_salary) {this.salary = new_salary;}
        public void setYear_of_hire(int new_year) {this.year_of_hire = new_year;}
        public void setName(String new_name) {super.setName(new_name);}

        // print all variables of an employee for testing
        public void writeOutput() {
            System.out.printf("\nName: %s\n", this.name);
            System.out.printf("Employee ID: %s\n", this.id);
            System.out.println("Salary: " + df.format(this.salary));
            System.out.printf("Year of Hire: %d\n", this.year_of_hire);
        }
        // compare two employees
        public boolean compareEmployees(Employee e) {
            return  this.name.equals(e.getName()) &&
                    this.id.equals(e.getId()) &&
                    this.salary == e.getSalary() &&
                    this.year_of_hire == e.getYear_of_hire();
        }

    }
}
