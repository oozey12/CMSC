/*
 * Class: CMSC203 
 * Instructor: Professor Evazi
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __Jesse Martinez________
*/



 class Procedure {
    // procedure information of patient
    private String procedure_Name;
    private String procedure_Date;
    private String practitioner_Name;
    private double procedure_Charges;

    // no-arg constructor
    public Procedure() {
        this.procedure_Name = "";
        this.procedure_Date = "";
        this.practitioner_Name = "";
        this.procedure_Charges = 0.0;
    }

    // constructor with procedure name and date parameters
    public Procedure(String procedure_Name, String procedure_Date) {
        this.procedure_Name = procedure_Name;
        this.procedure_Date = procedure_Date;
    }

    // constructor with all attributes including charges
    public Procedure(String procedure_Name, String procedure_Date, String practitioner_Name, double procedure_Charges) {
        this.procedure_Name = procedure_Name;
        this.procedure_Date = procedure_Date;
        this.practitioner_Name = practitioner_Name;
        this.procedure_Charges = procedure_Charges;
    }

    // Setters
    public void setProcedureName(String procedure_Name) {
        this.procedure_Name = procedure_Name;
    }

    public void setProcedureDate(String procedure_Date) {
        this.procedure_Date = procedure_Date;
    }

    public void setPractitionerName(String practitioner_Name) {
        this.practitioner_Name = practitioner_Name;
    }

    public void setProcedureCharges(double procedure_Charges) {
        this.procedure_Charges = procedure_Charges;
    }

    // Getters
    public String getProcedureName() {
        return procedure_Name;
    }

    public String getProcedureDate() {
        return procedure_Date;
    }

    public String getPractitionerName() {
        return practitioner_Name;
    }

    public double getProcedureCharges() {
        return procedure_Charges;
    }

    // toString method to display all information
    @Override
    public String toString() {
        return "Procedure Information:\n" +
               "\t\tProcedure Name: " + procedure_Name + "\n" +
               "\t\tProcedure Date: " + procedure_Date + "\n" +
               "\t\tPractitioner Name: " + practitioner_Name + "\n" +
               "\t\tProcedure Charges: " + procedure_Charges;
    }
}
