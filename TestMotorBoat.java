import java.util.Scanner;

public class TestMotorBoat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create scanner input to prompt user

        double fuelCapacity; //initialize fuel capacity
        do{
                System.out.print("Enter the capacity of the fuel tank: "); //check if fuel capacity is between 0 and 250
                fuelCapacity = input.nextDouble();
                if (fuelCapacity <= 0) System.out.println("Error: Fuel capacity must be greater than zero");
                else if (fuelCapacity > 250) System.out.println("Error: Fuel capacity must be less than or equal to 250 gallons");
        } while (fuelCapacity <= 0 || fuelCapacity > 250);

        double fuelAmount; //initialize fuel amount
        do{
            System.out.println("Enter the amount of the fuel tank: "); // check if fuel amount >0
            fuelAmount = input.nextDouble();
            if (fuelAmount <= 0) System.out.print("Error: Fuel amount must be greater than zero");
            else if (fuelAmount >= fuelCapacity) System.out.println();
        } while (fuelAmount<= 0 ||fuelAmount >= fuelCapacity);
        
        double maxSpeed; //initialize maximum speed
        do{
                System.out.println("Enter the maximum speed: "); //check if maxiumum speed is between 0 and 50
                maxSpeed = input.nextDouble();
                if (maxSpeed <= 0) System.out.println("Error: Maximum speed must be greater than zero");
                else if (maxSpeed > 50) System.out.println("Error: Maximum speed should be no more than 50 knots");
        }while (maxSpeed <= 0 || maxSpeed > 50);
        
        double currSpeed; //initialize current speed
        do{
                System.out.print("Enter the current speed: "); //check if current speed is less than max speed
                currSpeed = input.nextDouble();
                if (currSpeed <= 0) System.out.println( "Error: Current speed must be greather than zero");
                else if (currSpeed >= maxSpeed) System.out.println("Error: Current speed must be lower than the maximum speed");
        } while (currSpeed <= 0 || currSpeed >= maxSpeed);
        double motorEfficiency; //initialize motor efficiency
		do {
			System.out.print("Enter the efficiency (percentage): "); // check if efficiency is between 0 and 100
			motorEfficiency = input.nextDouble();
			if (motorEfficiency <= 0) System.out.println("Error: Efficiency must be greater than zero");
			else if (motorEfficiency > 100) System.out.println("Error: Efficiency should be less than or equal to 100");
		} while (motorEfficiency <= 0 || motorEfficiency > 100);

		double distTraveled; //initialize distance traveled
		do {
			System.out.print("Enter the total distance traveled so far: "); //check if distance is greater than zero
			distTraveled = input.nextDouble();
			if (distTraveled <= 0) System.out.println("Error: Distance must be greater than zero");
		} while (distTraveled <= 0);
        
        MotorBoat mb = new MotorBoat(fuelCapacity, fuelAmount, maxSpeed, currSpeed, motorEfficiency, distTraveled);
        System.out.println();

        System.out.format("Fuel Amount: %.6f\n", mb.fuelAmount);
        input.nextLine();
        System.out.println("Would you like to add more fuel (y/n): ");
        char ans = input.next().charAt(0);
        if (ans == 'y') {
            System.out.println("How much fuel would you like to add: ");
            double addFuel = input.nextFloat();
            mb.setFuelAmount(addFuel);
            System.out.format("Fuel Amount: %.6f\n", mb.fuelAmount);
        }
       double timeOperate; //initialize time operation
		do {
			System.out.print("How long would you like to operate the boat (hours): ");
			timeOperate = input.nextDouble();
			if (timeOperate <= 0) System.out.println("Error: Time must be greater than zero"); //must be between 0 and 8
			else if (timeOperate > 8) System.out.println("Error: Time can be no longer than 8 hours.");
		} while (timeOperate <= 0 || timeOperate > 8);


        double time = input.nextFloat();

        input.nextLine();
        System.out.println("Would you like to change the speed of the motorboat (y/n): ");
        char ans2 = input.next().charAt(0);
        if (ans2 == 'y') {
            System.out.println("What would you like to change the speed to: ");
            double newSpeed = input.nextFloat();
            mb.setCurrSpeed(newSpeed);
        }
        System.out.println();

        mb.operateBoat(time);
        System.out.println();

        System.out.format("Remaining fuel: %.6f\n", mb.getFuelAmount()); //calculate remaining fuel
        System.out.format("Updated distance: %.6f\n", mb.getDistTraveled());//calculate distance
    }
}

