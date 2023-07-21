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
import numpy as np
import matplotlib.pyplot as plt

# Set random seed for reproducibility
np.random.seed(42)

# Generate the dataset
X = np.linspace(-10, 10, 80)
Y = X**2 + np.random.normal(0, 10, size=X.shape[0])

# Perform quadratic polynomial regression
coefficients = np.polyfit(X, Y, 2)
quadratic_function = np.poly1d(coefficients)

# Calculate R^2 value
Y_pred = quadratic_function(X)
Y_mean = np.mean(Y)
r_squared = 1 - np.sum((Y - Y_pred)**2) / np.sum((Y - Y_mean)**2)
print("R^2 value:", r_squared)

# Plot the data and the quadratic function
plt.scatter(X, Y, label='Data Points')
plt.plot(X, quadratic_function(X), color='red', label='Quadratic Function')
plt.title('Quadratic Polynomial Regression')
plt.xlabel('X')
plt.ylabel('Y')
plt.legend()
plt.grid(True)
plt.show()


import numpy as np
import matplotlib.pyplot as plt

# Set the random seed for reproducibility
np.random.seed(42)

# Generate 1000 random numbers from a normal distribution
mean = 0
std_dev = 1
num_samples = 1000
random_numbers = np.random.normal(mean, std_dev, num_samples)

# Calculate mean and standard deviation
sample_mean = np.mean(random_numbers)
sample_std_dev = np.std(random_numbers)

# Plot histogram with needle plot overlay
plt.figure(figsize=(10, 6))
plt.hist(random_numbers, bins=500, density=True, alpha=0.6, label='Histogram')

# Plot needle plot overlay
plt.axvline(sample_mean, color='red', linestyle='dashed', linewidth=2, label='Sample Mean')
plt.axvline(sample_mean + sample_std_dev, color='green', linestyle='dashed', linewidth=2, label='1 Standard Deviation')
plt.axvline(sample_mean - sample_std_dev, color='green', linestyle='dashed', linewidth=2)

plt.title('Normal Distribution Simulation')
plt.xlabel('Random Numbers')
plt.ylabel('Frequency')
plt.legend()
plt.grid(True)
plt.show()
