public class TaxReturn {
    private String socialSecurityNumber;
    private String lastName;
    private String firstName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private double annualIncome;
    private String maritalStatus;
    private double taxLiability;

    // Constructor
    public TaxReturn(String socialSecurityNumber, String lastName, String firstName,
                     String streetAddress, String city, String state, String zipCode,
                     double annualIncome, String maritalStatus) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.maritalStatus = maritalStatus;

        // Calculate tax liability based on annual income and marital status
        calculateTaxLiability();
    }

    // Method to calculate tax liability
    private void calculateTaxLiability() {
        if (annualIncome <= 20000) {
            taxLiability = (maritalStatus.equals("Single")) ? annualIncome * 0.15 : annualIncome * 0.14;
        } else if (annualIncome <= 50000) {
            taxLiability = (maritalStatus.equals("Single")) ? annualIncome * 0.22 : annualIncome * 0.20;
        } else {
            taxLiability = (maritalStatus.equals("Single")) ? annualIncome * 0.30 : annualIncome * 0.28;
        }
    }

    // Method to display TaxReturn data
    public void display() {
        System.out.println("Question 3 \nTax Return Data:");
        System.out.println("Social Security Number: " + socialSecurityNumber);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Marital Status: " + maritalStatus);
        System.out.println("Tax Liability: $" + taxLiability);
    }

    
}