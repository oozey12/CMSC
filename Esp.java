import java.util.Scanner;
import java.util.Random;
/*
 * Class: CMCS203
 * Instructor: Prof. Evazi
 * Desciption: The program involves the user to guess the color of the computer's random color.
 * Complier/Platoform: Eclipse IDE for Java Developers
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source/ I have not given my code to any student
 * Signed, { Jesse Martinez }
 */

public class Esp {
    public static void main(String[] args) {
        // getting user information
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String studentName = userInput.nextLine();
        System.out.print("Enter your MC ID number with the M: ");
        String idNumber = userInput.nextLine();
        System.out.print("Enter self-description: ");
        String selfDescription = userInput.nextLine();
        System.out.print("Enter due date in the format mm/dd/yyyy: ");
        String dueDate = userInput.nextLine();

        // Estbalishing variables for the computer to choose random colors
        Random randomColor = new Random();
        String colorRed = "Red";
        String colorOrange = "Orange";
        String colorYellow = "Yellow";
        String colorGreen = "Green";
        String colorBlue = "Blue";
        String colorPurple = "Purple";
        String colorPink = "Pink";

        // game logic
        int rounds = 0;
        int wins = 0;
        while (rounds < 11) {
            String computerColor = "";
            int colorID = randomColor.nextInt(7) + 1;
            switch (colorID) {
                case 1:
                    computerColor = colorRed;
                    break;
                case 2:
                    computerColor = colorOrange;
                    break;
                case 3:
                    computerColor = colorYellow;
                    break;
                case 4:
                    computerColor = colorGreen;
                    break;
                case 5:
                    computerColor = colorBlue;
                    break;
                case 6:
                    computerColor = colorPurple;
                    break;
                case 7:
                    computerColor = colorPink;
                    break;
            }

            System.out.println("\nRound " + (rounds + 1));
            System.out.println("Pick a color: ");
            System.out.println("1. Red 2. Orange 3. Yellow 4. Green 5. Blue 6. Purple 7. Pink");
            String userChoice = userInput.nextLine();
            // checking if user input is valid
            while (!userChoice.equalsIgnoreCase(colorRed) && !userChoice.equalsIgnoreCase(colorOrange) &&
                    !userChoice.equalsIgnoreCase(colorYellow) && !userChoice.equalsIgnoreCase(colorGreen) &&
                    !userChoice.equalsIgnoreCase(colorBlue) && !userChoice.equalsIgnoreCase(colorPurple) &&
                    !userChoice.equalsIgnoreCase(colorPink)) {
                System.out.println("Not a valid color. Try again.");
                userChoice = userInput.nextLine();
            }
            if (userChoice.equalsIgnoreCase(computerColor)) {
                System.out.println("You got it! the color was " + computerColor);
                wins++;
            } else {
                System.out.println("You got it wrong! the color was " + computerColor);
            }
            rounds++;
        }
        // prining results and user information
        System.out.println("\nyou guessed " + wins + " out of 11 correct");
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + idNumber);
        System.out.println("Student description: " + selfDescription);
        System.out.println("Student due date: " + dueDate);
        System.out.println("\nProgrammed by: Jesse Martinez");
    }
}
