import java.util.concurrent.*;

// Class representing a photographer
class Photographer extends Thread {
    private String name;

    public Photographer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is ready to take photos.");
        // Simulate capturing photos
        capturePhotos();
        System.out.println(name + " has finished taking photos.");
        // Simulate post-processing
        processPhotos();
        System.out.println(name + " has finished processing photos and left the studio.");
    }

    private void capturePhotos() {
        // Simulate photo capturing time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void processPhotos() {
        // Simulate photo processing time
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Class representing the photo lab technician
class PhotoLabTechnician extends Thread {
    private BlockingQueue<String> photoOrders;

    public PhotoLabTechnician(BlockingQueue<String> photoOrders) {
        this.photoOrders = photoOrders;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String photoOrder = photoOrders.take();
                if (photoOrder.equals("exit")) {
                    System.out.println("Photo lab technician received exit signal. Exiting.");
                    break;
                }
                System.out.println("Photo lab technician is processing photos for order: " + photoOrder);
                // Simulate photo processing time
                Thread.sleep(4000);
                System.out.println("Photo lab technician has finished processing photos for order: " + photoOrder);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Class representing the photo studio
public class PhotoStudio {
    public static void main(String[] args) {
        BlockingQueue<String> photoOrders = new LinkedBlockingQueue<>();

        PhotoLabTechnician technician = new PhotoLabTechnician(photoOrders);
        technician.start();

        // Simulate multiple photographers
        for (int i = 1; i <= 5; i++) {
            Photographer photographer = new Photographer("Photographer " + i);
            photographer.start();
            // Simulate time between photographers
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Place a photo order for each photographer
            String photoOrder = "Prints for Photographer " + i;
            System.out.println("Customer places photo order: " + photoOrder);
            try {
                photoOrders.put(photoOrder);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Signal photo lab technician to exit
        try {
            photoOrders.put("exit");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for photo lab technician to finish
        try {
            technician.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
