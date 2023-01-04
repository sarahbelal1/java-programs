public class Staff extends Employee {

    private int payGrade;

    public Staff(String name, String id, double salary, int year_of_hire, int initialPaygrade) {
        super(name, id, salary, year_of_hire);
        payGrade = initialPaygrade;

    }


   public void setGrade(int grade) {
       if (grade >= 1 && grade <= 20)
           payGrade = grade;
       else {
           payGrade = 0;
           System.out.println("Error, pay grade must be between 1 and 20");
       }
   }

   public int getGrade()
       {
       return payGrade;
       }


    public void writeOutput () {
        System.out.printf("\nName: %s\n" + this.getName());
        System.out.printf("Employee ID %s\n", this.id);
        System.out.printf("Salary: %f\n", this.salary);
        System.out.printf("Year of Hire: %d\n", this.year_of_hire);
        System.out.println("Pay Grade: " + payGrade);
            }
        }





