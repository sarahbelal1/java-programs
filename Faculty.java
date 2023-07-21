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
import pandas as pd
import matplotlib.pyplot as plt

# Replace 'path_to_your_csv_file' with the actual path of your CSV file
csv_file_path = 'path_to_your_csv_file'

# Load the data from the CSV file into a pandas DataFrame
df = pd.read_csv(csv_file_path)

# Calculate the IQR for 'Stock Price' and 'Market Capitalization' columns
Q1_stock_price = df['Stock Price'].quantile(0.25)
Q3_stock_price = df['Stock Price'].quantile(0.75)
IQR_stock_price = Q3_stock_price - Q1_stock_price

Q1_market_cap = df['Market Capitalization'].quantile(0.25)
Q3_market_cap = df['Market Capitalization'].quantile(0.75)
IQR_market_cap = Q3_market_cap - Q1_market_cap

# Find the outliers for 'Stock Price' and 'Market Capitalization' columns
outliers_stock_price = df[(df['Stock Price'] < Q1_stock_price - 1.5 * IQR_stock_price) | (df['Stock Price'] > Q3_stock_price + 1.5 * IQR_stock_price)]
outliers_market_cap = df[(df['Market Capitalization'] < Q1_market_cap - 1.5 * IQR_market_cap) | (df['Market Capitalization'] > Q3_market_cap + 1.5 * IQR_market_cap)]

# Visualize the outliers using box plots
plt.figure(figsize=(10, 6))
plt.subplot(2, 1, 1)
plt.boxplot(df['Stock Price'], vert=False)
plt.title('Stock Price')
plt.subplot(2, 1, 2)
plt.boxplot(df['Market Capitalization'], vert=False)
plt.title('Market Capitalization')
plt.tight_layout()
plt.show()

# Print the numerical evidence of outliers
print("Outliers in Stock Price:")
print(outliers_stock_price)

print("\nOutliers in Market Capitalization:")
print(outliers_market_cap)




import pandas as pd
import matplotlib.pyplot as plt
from scipy import stats

# Replace 'path_to_your_csv_file' with the actual path of your CSV file
csv_file_path = 'path_to_your_csv_file'

# Load the data from the CSV file into a pandas DataFrame
df = pd.read_csv(csv_file_path)

# Calculate the IQR for 'Stock Price' and 'Market Capitalization' columns
Q1_stock_price = df['Stock Price'].quantile(0.25)
Q3_stock_price = df['Stock Price'].quantile(0.75)
IQR_stock_price = Q3_stock_price - Q1_stock_price

Q1_market_cap = df['Market Capitalization'].quantile(0.25)
Q3_market_cap = df['Market Capitalization'].quantile(0.75)
IQR_market_cap = Q3_market_cap - Q1_market_cap

# Exclude outliers for 'Stock Price' and 'Market Capitalization' columns
df = df[(df['Stock Price'] >= Q1_stock_price - 1.5 * IQR_stock_price) & (df['Stock Price'] <= Q3_stock_price + 1.5 * IQR_stock_price)]
df = df[(df['Market Capitalization'] >= Q1_market_cap - 1.5 * IQR_market_cap) & (df['Market Capitalization'] <= Q3_market_cap + 1.5 * IQR_market_cap)]

# Fit a regression line
slope, intercept, r_value, p_value, std_err = stats.linregress(df['Market Capitalization'], df['Stock Price'])

# Print the regression results
print("Regression Line:")
print("Slope:", slope)
print("Intercept:", intercept)
print("R-squared:", r_value**2)
print("P-value:", p_value)

# Plot the data points and the regression line
plt.figure(figsize=(8, 6))
plt.scatter(df['Market Capitalization'], df['Stock Price'], color='b', label='Data Points')
plt.plot(df['Market Capitalization'], intercept + slope * df['Market Capitalization'], color='r', label='Regression Line')
plt.xlabel('Market Capitalization')
plt.ylabel('Stock Price')
plt.title('Regression Analysis')
plt.legend()
plt.show()

