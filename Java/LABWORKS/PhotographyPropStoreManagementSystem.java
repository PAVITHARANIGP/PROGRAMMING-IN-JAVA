package Java.LABWORKS.LAB8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Class to represent a Photography Prop
class Prop {
    private String propCode;
    private String propName;

    public Prop(String propCode, String propName) {
        this.propCode = propCode;
        this.propName = propName;
    }

    public String getPropCode() {
        return propCode;
    }

    public String getPropName() {
        return propName;
    }
}

// Class to represent a Photographer
class Photographer {
    private String photographerId;
    private String photographerName;

    public Photographer(String photographerId, String photographerName) {
        this.photographerId = photographerId;
        this.photographerName = photographerName;
    }

    public String getPhotographerId() {
        return photographerId;
    }

    public String getPhotographerName() {
        return photographerName;
    }
}

// Class to represent a Photography Order
class Order {
    private String orderId;
    private Photographer photographer;
    private Prop prop;
    private String deliveryAddress;

    public Order(String orderId, Photographer photographer, Prop prop, String deliveryAddress) {
        this.orderId = orderId;
        this.photographer = photographer;
        this.prop = prop;
        this.deliveryAddress = deliveryAddress;
    }

    public String getOrderId() {
        return orderId;
    }

    public Photographer getPhotographer() {
        return photographer;
    }

    public Prop getProp() {
        return prop;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}

public class PhotographyPropStoreManagementSystem {
    public static void main(String[] args) {
        // Create a list of props
        List<Prop> props = new ArrayList<>();
        props.add(new Prop("P001", "Vintage Camera"));
        props.add(new Prop("P002", "Wooden Frame"));
        props.add(new Prop("P003", "Candle Lantern"));

        // Create a list of photographers
        List<Photographer> photographers = new ArrayList<>();
        photographers.add(new Photographer("PH001", "John Photographer"));
        photographers.add(new Photographer("PH002", "Emma Photography"));

        // Create a HashMap of delivery addresses
        HashMap<String, String> deliveryAddresses = new HashMap<>();
        deliveryAddresses.put("D001", "123 Main Street, Cityville");
        deliveryAddresses.put("D002", "456 Oak Avenue, Townsville");
        deliveryAddresses.put("D003", "789 Pine Road, Villagetown");

        // Create a list of orders
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("O001", photographers.get(0), props.get(0), deliveryAddresses.get("D001")));
        orders.add(new Order("O002", photographers.get(1), props.get(1), deliveryAddresses.get("D002")));
        orders.add(new Order("O003", photographers.get(0), props.get(2), deliveryAddresses.get("D003")));

        // Display information (you can customize this based on your requirements)
        System.out.println("Props:");
        for (Prop prop : props) {
            System.out.println(prop.getPropCode() + " - " + prop.getPropName());
        }

        System.out.println("\nPhotographers:");
        for (Photographer photographer : photographers) {
            System.out.println(photographer.getPhotographerId() + " - " + photographer.getPhotographerName());
        }

        System.out.println("\nOrders:");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + " - " +
                    "Photographer: " + order.getPhotographer().getPhotographerName() +
                    ", Prop: " + order.getProp().getPropName() +
                    ", Delivery Address: " + order.getDeliveryAddress());
        }
    }
}
