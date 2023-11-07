package Lab1;

public class Prop extends Photography{
    private String propType;
    private String propMaterial;
    private double propPrice;

    public Prop() {
        super();
        this.propType = "Unknown";
        this.propMaterial = "Unknown";
        this.propPrice = 0.0;
    }

    public Prop( String comapanyName,String location,int numberOfEmployees,String propType, String propMaterial, double propPrice) {
        super(comapanyName, location, numberOfEmployees);
        this.propType = propType;
        this.propMaterial = propMaterial;
        this.propPrice = propPrice;
    }

    public void setPropDetails(String propType, String propMaterial, double propPrice) {
        this.propType = propType;
        this.propMaterial = propMaterial;
        this.propPrice = propPrice;
    }

    

    public void work(){
        System.out.println("NO work Done!");
    }

    public void work(String shootType){
        System.out.println(shootType+" Work was done ");
    }

    public void work(int numphotos){
        System.out.println(numphotos + " photos was taken ");
    }


    public void showDetails(){
        System.out.println("Company Name: " + this.getCompanyName());
        System.out.println("Location: " + this.getLocation());
        System.out.println("Number of Employees: " + this.getNumberOfEmployees());
        System.out.println("Prop Type: " + this.propType);
        System.out.println("Prop Material: " + this.propMaterial);
        System.out.println("Prop Price: " + this.propPrice);
    }  
    
    
    public static void main(String[] args) {
        Prop P1 = new Prop();
        Prop P2 = new Prop("CompanyABC", "Bangalore", 10, "Basket", "Bamboo", 1000);

        System.out.println("\nWorks");
        P2.work();
        P2.work(10);

        P2.work("BirthDay Party");
        
        System.out.println("\nDetails");
        P2.showDetails();


    }
}
