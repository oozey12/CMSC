 /*
 * Class: CMSC203 
 * Instructor:Professor Evazi
 * Description: (Gets paintient information)
 * Due: 02/23/2024
 * Platform/compiler: Eclipe IDE
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __Jesse Martinez________
*/

 
 class Patient {
    // Patient Name
    public String firstName;
    public String middleName;
    public String lastName;

    // Patient Information
    public String streetAddress;
    public String city;
    public String state;
    public String zipCode;
    public String phoneNumber;

    // Emergency contact
    public String emergencyName;
    public String emergencyPhone;

    // No-argument constructor
    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyName = "";
        emergencyPhone = "";
    }

    // Constructor for patient's full name
    public Patient(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Constructor for patient's full information
    public Patient(String firstName, String middleName, String lastName, String streetAddress, String city,
            String state, String zipCode, String phoneNumber, String emergencyName, String emergencyPhone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emergencyName = emergencyName;
        this.emergencyPhone = emergencyPhone;
    }

    // Getters / Accessors
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    // Setters / Mutators
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    // Method to build patient's full name
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    // Method to build patient's address
    public String buildAddress() {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    // Method to build patient's emergency contact
    public String buildEmergencyContact() {
        return emergencyName + " - " + emergencyPhone;
    }

  @Override
  public String toString(){
    return "Patient info: \n\t" + buildFullName() + "\n\t" + "Address: " + buildAddress() + "\n\t" + "Emergency Contact: " + buildEmergencyContact();
  }
}