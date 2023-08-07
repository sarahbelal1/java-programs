    public class MotorBoat {
        double fuelCapacity; // initializing all parameters that this class will use when an instance of it
                             // is made
        double fuelAmount;
        double maxSpeed;
        double currSpeed;
        double motorEfficiency;
        double distTraveled;

        public MotorBoat(double fuelCapacity, double fuelAmount, double maxSpeed, double currSpeed,
                double motorEfficiency, double distTraveled) { // constructor class

            this.fuelCapacity = fuelCapacity;
            this.fuelAmount = fuelAmount;
            this.maxSpeed = maxSpeed;
            this.currSpeed = currSpeed;
            this.motorEfficiency = motorEfficiency;
            this.distTraveled = distTraveled;
        }

        public int setCurrSpeed(double currSpeed) { // sets speed of the motorboat class attribute currSpeed to the
                                                     // speed from the method parameter
            if (currSpeed >= maxSpeed)
                System.out.println("Error: Speed must be lower than the maximum speed");
            else {
                this.currSpeed = currSpeed;
                return 0;
            }
            return 1;
        }

        public int setFuelAmount(double fuelAmount) { // sets  amount of fuel in the motorboat class attribute
            if (fuelAmount + this.fuelAmount >= fuelCapacity) {
                System.out.println("Error: Total amount of fuel must be lower than the capacity of the tank");
                return 1;
            }
            this.fuelAmount += fuelAmount;
            return 0;                            // fuelAmount to amount from the method parameter
        }

        public double getFuelAmount() { // returns the motorboat class attribute fuelAmount
            return this.fuelAmount;
        }

        public double getDistTraveled() { // returns the total distance traveled by the boat
            return this.distTraveled;
        }

        public boolean operateBoat(double time) { // returns true or false based on whether the boat has enough fuel to
                                                  // operate based on the calculated fuel burn
            double fuelBurn = (Math.pow(this.currSpeed, 2) * this.motorEfficiency * time) / 100;
            if (fuelBurn < this.fuelAmount) {
                System.out.println("The boat is operating.");
                this.fuelAmount -= fuelBurn;
                double distTraveled = this.currSpeed * time;
                this.distTraveled += distTraveled;
                return true;
            } else {
                System.out.println("Error: not enough fuel to operate boat");
                return false;
            }
        }
    }
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Read the CSV file
age_and_risk_category_df = pd.read_csv('age_and_risk_category.csv')

# Explore the data
print(age_and_risk_category_df.head())
print(age_and_risk_category_df.info())

# Data Analysis: Boxplot
sns.set(style="whitegrid")
plt.figure(figsize=(10, 8))

# Boxplot
plt.subplot(2, 1, 1)
sns.boxplot(x="risk_category", y="age", data=age_and_risk_category_df)
plt.title("Relationship Between Age and Risk Category")
plt.xlabel("Risk Category")
plt.ylabel("Age")

# Histogram
plt.subplot(2, 1, 2)
g = sns.histplot(data=age_and_risk_category_df, x="age", hue="risk_category", multiple="stack")
plt.title("Age Distribution Within Each Risk Category")
plt.xlabel("Age")
plt.ylabel("Frequency")

plt.tight_layout()
plt.show()

# Data Analysis: Summary Statistics
summary_stats = age_and_risk_category_df.groupby('risk_category')['age'].describe()
print("\nSummary Statistics:")
print(summary_stats)


import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Read the CSV file
available_assets_and_risk_score_df = pd.read_csv('available_assets_and_risk_score.csv')

# Data Analysis: Boxplot
sns.set(style="whitegrid")
plt.figure(figsize=(10, 8))

# Boxplot
plt.subplot(2, 1, 1)
sns.boxplot(x="risk_score", y="available_funds", data=available_assets_and_risk_score_df)
plt.title("Relationship Between Available Funds and Risk Score")
plt.xlabel("Risk Score")
plt.ylabel("Available Funds")

# Histogram
plt.subplot(2, 1, 2)
g = sns.histplot(data=available_assets_and_risk_score_df, x="available_funds", hue="risk_score", multiple="stack")
plt.title("Available Funds Distribution Within Each Risk Score")
plt.xlabel("Available Funds")
plt.ylabel("Frequency")

plt.tight_layout()
plt.show()

# Data Analysis: Summary Statistics
summary_stats = available_assets_and_risk_score_df.groupby('risk_score')['available_funds'].describe()
print("\nSummary Statistics:")
print(summary_stats)

import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Read the CSV file
marital_status_and_risk_score_df = pd.read_csv('marital_status_and_risk_score.csv')

# Data Analysis: Countplot
plt.figure(figsize=(10, 6))
sns.countplot(x="marital_status", hue="risk_score", data=marital_status_and_risk_score_df)
plt.title("Relationship Between Marital Status and Risk Score")
plt.xlabel("Marital Status")
plt.ylabel("Count")
plt.legend(title="Risk Score")
plt.show()

# Data Analysis: Summary Statistics
summary_stats = marital_status_and_risk_score_df.groupby('marital_status')['risk_score'].describe()
print("\nSummary Statistics:")
print(summary_stats)

import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Read the CSV file
state_and_risk_score_df = pd.read_csv('state_and_risk_score.csv')

# Data Analysis: Countplot
plt.figure(figsize=(10, 6))
sns.countplot(x="state", hue="risk_score", data=state_and_risk_score_df)
plt.title("Relationship Between State and Risk Score")
plt.xlabel("State")
plt.ylabel("Count")
plt.legend(title="Risk Score")
plt.xticks(rotation=45)
plt.show()

# Data Analysis: Summary Statistics
summary_stats = state_and_risk_score_df.groupby('state')['risk_score'].describe()
print("\nSummary Statistics:")
print(summary_stats)


