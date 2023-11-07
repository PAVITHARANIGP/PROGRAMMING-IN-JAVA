public class Alarm {
    String message;
    private boolean active;

    public Alarm(String message) {
        this.message = message;
        this.active = false;
    }

    public void visualize() {
        if (active) {
            System.out.println("Fire Alarm Message: " + message);
            System.out.println("Status: Active");
        } else {
            System.out.println("Fire Alarm is not detected.");
        }
    }

    public void register() {
        active = true;
        System.out.println("Alarm registered.");
    }

    public static void main(String[] args) {
        Alarm myAlarm = new Alarm("FIRE ALARM!");
        myAlarm.visualize();

        myAlarm.register();
        myAlarm.visualize();
    }
}
