import java.util.Scanner;

public class Faculty extends Employee {
    private String thisTitle;

    public Faculty (String name, String id, double salary, int year_of_hire, String initialTitle) {
        super(name, id, salary, year_of_hire);
        this.id = id;
        this.salary = salary;
        this.year_of_hire = year_of_hire;
        thisTitle = initialTitle;
    }

    public void setTitle(String newTitle) {
        thisTitle = newTitle;
    }

    public String getTitle() {
        return thisTitle;
    }


    public void writeOutput () {
        System.out.printf("\nName: %s\n" + this.getName());
        System.out.printf("Employee ID %s\n", this.id);
        System.out.printf("Salary: %f\n", this.salary);
        System.out.printf("Year of Hire: %d\n", this.year_of_hire);
        System.out.println("Title: " + thisTitle);
        }
    }


