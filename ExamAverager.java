import java.util.Scanner;
public class ExamAverager {
        public static void main(String[] args) {
            // Ask user to enter scores
            System.out.println("This program computes the average of a list of (nonnegative) exam scores.");
            System.out.println("Enter all the scores to be averaged.");
            System.out.println("Enter a negative number after you have entered all the scores.");
            // Declare string to stay/exit out of program
            String answer;
            // Declare array to store scores
            double[] scoresArray = new double[100];
            // Create scanner variable to prompt users to input test scores
            Scanner keyboard = new Scanner(System.in);
            do {
                // Declare variables to keep track of scores
                double sum;
                double next;
                int count = 0;
                sum = 0;
                next = keyboard.nextDouble();
                // Loop through scores until input is -1
                while (next >= 0) {
                    sum = sum + next;
                    scoresArray[count] = next;
                    count += 1;
                    next = keyboard.nextDouble();
                }
                // Nested if statement to determine average and whether each score is above or below
                if (count > 0) {
                    System.out.println("The average is "
                            + (sum / count));
                    for (int i = 0; i < count; i++) {
                        if (scoresArray[i] > (sum / count))
                        System.out.println("Score#" + (i+1) + ": " + scoresArray[i] + " -- Above Average");
                        if (scoresArray[i] <(sum / count))
                        System.out.println("Score#" + (i+1) + ": " + scoresArray[i] + " -- Below Average");
                        if (scoresArray[i] == (sum / count))
                        System.out.println("Score#" + (i+1) + ": " + scoresArray[i] +" -- Average");
                    }
                }
                else
                    System.out.println("No scores to average.");
                //  Ask user if they want to continue inputting scores
                System.out.println("Want to average another exam?");
                System.out.println("Enter yes or no:");
                answer = keyboard.next();
                // Check case "yes" or "y" to continue program
            } while (answer.equalsIgnoreCase("yes") || (answer.equalsIgnoreCase("y") ));

        }
    }

