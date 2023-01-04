public class Employee extends Person {
    private int ID;
    double salary;
    int year_of_hire;

    public Employee (String name, int id, double salary, int year_of_hire) {
        super(name);
        ID = id;
        this.salary = salary;
        this.year_of_hire = year_of_hire;
    }


    public int getId() {
        return ID;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getYear_of_hire() {
        return this.year_of_hire;
    }

    public String getName() {
        return super.getName();
    }

    public void setId(int new_id) {
        ID = new_id;
    }

    public void setSalary(double new_salary) {
        this.salary = new_salary;
    }

    public void setYear_of_hire(int new_year) {
        this.year_of_hire = new_year;
    }

    public void setName(String new_name) {
        super.setName(new_name);
    }

    public void writeOutput() {
        System.out.printf("\nName: %s\n", this.getName());
        System.out.printf("Employee ID %s\n", ID);
        System.out.printf("Salary: %f\n", this.salary);
        System.out.printf("Year of Hire: %d\n", this.year_of_hire);
    }

    public boolean compareEmployees(Employee e) {
        if (this.getName().equals(e.getName())) if (ID == (e.getId()))
            if (this.salary == e.getSalary()) if (this.year_of_hire == e.getYear_of_hire()) return true;
        return false;
    }
}

