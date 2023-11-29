package lab_1;

public class Photography {
    private String companyName;
    private String location;
    private int numberOfEmployees;

    // Default constructor
    public Photography() {
        this.companyName = "Unknown";
        this.location = "Unknown";
        this.numberOfEmployees = 0;
    }

    // Constructor with parameters
    public Photography(String companyName, String location, int numberOfEmployees) {
        this.companyName = companyName;
        this.location = location;
        this.numberOfEmployees = numberOfEmployees;
    }

    // Getters for companyName, location, and numberOfEmployees
    public String getCompanyName() {
        return this.companyName;
    }

    public String getLocation() {
        return this.location;
    }

    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    // Other methods if present...
    // ...
}
