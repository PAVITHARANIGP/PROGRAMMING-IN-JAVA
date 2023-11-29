package lab_2;
import lab_1.Photography;

public class Prop extends Photography implements Workable {
    private String propType;
    private String propMaterial;
    private double propPrice;

    public Prop() {
        super();
        this.propType = "Unknown";
        this.propMaterial = "Unknown";
        this.propPrice = 0.0;
    }

    public Prop(String companyName, String location, int numberOfEmployees, String propType, String propMaterial, double propPrice) {
        super(companyName, location, numberOfEmployees);
        this.propType = propType;
        this.propMaterial = propMaterial;
        this.propPrice = propPrice;
    }

    public void setPropDetails(String propType, String propMaterial, double propPrice) {
        this.propType = propType;
        this.propMaterial = propMaterial;
        this.propPrice = propPrice;
    }

    public void showDetails() {
        System.out.println("Company Name: " + this.getCompanyName());
        System.out.println("Location: " + this.getLocation());
        System.out.println("Number of Employees: " + this.getNumberOfEmployees());
        System.out.println("Prop Type: " + this.propType);
        System.out.println("Prop Material: " + this.propMaterial);
        System.out.println("Prop Price: " + this.propPrice);
    }

    @Override
    public void work() {
        System.out.println("No specific work defined!");
    }

    @Override
    public void work(String shootType) {
        System.out.println("Work done for " + shootType);
    }

    @Override
    public void work(int numPhotos) {
        System.out.println("Photos taken: " + numPhotos);
    }
}
