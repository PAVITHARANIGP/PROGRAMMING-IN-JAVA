// Abstract class representing a photography prop
abstract class PhotographyProp {
    private String name;
    private double price;

    // Constructor
    public PhotographyProp(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayDetails();

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Concrete subclass representing a CameraProp
class CameraProp extends PhotographyProp {
    private String cameraType;

    // Constructor
    public CameraProp(String name, double price, String cameraType) {
        super(name, price);
        this.cameraType = cameraType;
    }

    // Overriding the displayDetails method from the superclass
    @Override
    public void displayDetails() {
        System.out.println(
                "Camera Prop - Name: " + getName() + ", Price: $" + getPrice() + ", Camera Type: " + cameraType);
    }
}

// Concrete subclass representing a LightingProp
class LightingProp extends PhotographyProp {
    private int brightness;

    // Constructor
    public LightingProp(String name, double price, int brightness) {
        super(name, price);
        this.brightness = brightness;
    }

    // Getter method for brightness
    public int getBrightness() {
        return brightness;
    }

    // Overriding the displayDetails method from the superclass
    @Override
    public void displayDetails() {
        System.out.println(
                "Lighting Prop - Name: " + getName() + ", Price: $" + getPrice() + ", Brightness: " + brightness);
    }
}

// Final subclass representing a specific type of LightingProp
final class StudioLightingProp extends LightingProp {
    private String studioName;

    // Constructor
    public StudioLightingProp(String name, double price, int brightness, String studioName) {
        super(name, price, brightness);
        this.studioName = studioName;
    }

    // Overriding the displayDetails method from the superclass
    @Override
    public void displayDetails() {
        System.out.println("Studio Lighting Prop - Name: " + getName() + ", Price: $" + getPrice() +
                ", Brightness: " + getBrightness() + ", Studio Name: " + studioName);
    }
}

// Main class to test the implementation
public class PhotographyPropStore {
    public static void main(String[] args) {
        CameraProp camera = new CameraProp("Canon EOS", 1200.00, "DSLR");
        LightingProp lighting = new LightingProp("Softbox", 150.00, 100);
        StudioLightingProp studioLighting = new StudioLightingProp("Professional Studio Light", 500.00, 200,
                "Studio A");

        camera.displayDetails();
        lighting.displayDetails();
        studioLighting.displayDetails();
    }
}
