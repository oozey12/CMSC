/*
 * Class: CMSC203 
 * Instructor: professor Evazi
 * Description: (Displays information passed to the Patient and Procedure class)
 * Due: 02/23/2024
 * Platform/compiler: Eclipe IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: ___Jesse Martinez_______
*/



public class PatientDriverApp {
    public static void main(String[] args) {
        // Create an instance of the Patient class with sample data
        Patient patient = new Patient("John", "Miller", "Conner", "123 main blvd", "Gaithersburg", "MD",
                                       "20877", "240-750-3445", "Billy Carter", "240-321-9832");

        // Create three instances of the Procedure class using different constructors
        Procedure procedure1 = new Procedure("Physical Exam", "01/01/2023");
        Procedure procedure2 = new Procedure("X-Ray", "02/02/2023", "Magrid Sillos", 100.0);
        Procedure procedure3 = new Procedure();
        procedure3.setProcedureName("Heart Surgery");
        procedure3.setProcedureDate("03/03/2023");
        procedure3.setPractitionerName("John Cena");
        procedure3.setProcedureCharges(200.0);

        // Display patient's information
        displayPatient(patient);

        // Display information about all three procedures
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display the total charges of the three procedures
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%.2f%n", totalCharges);
    }

    // Method to display patient's information
    public static void displayPatient(Patient patient) {
        System.out.println(patient);
    }

    // Method to display procedure's information
    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    // Method to calculate the total charges of three procedures
    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
    }
}
