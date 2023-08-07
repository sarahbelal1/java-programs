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

def generate_dynamic_report():
    # Read data from CSV files
    risk_score_df = pd.read_csv('risk_score.csv')
    customer_asset_df = pd.read_csv('customer_asset.csv')
    
    # Perform JOIN operations
    merged_df = risk_score_df.merge(customer_asset_df, on="customer_id")
    
    # Create the view-like DataFrame
    dynamic_report = merged_df[["customer_id", "risk_score", "available_funds"]]
    
    return dynamic_report

# Generate and print the dynamic report
report = generate_dynamic_report()
print(report)

