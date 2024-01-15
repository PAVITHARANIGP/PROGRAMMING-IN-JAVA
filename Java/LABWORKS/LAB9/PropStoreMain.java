package LABWORKS.LAB9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class PhotographyProp {
    private String name;
    private String category;

    public PhotographyProp(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void displayDetails() {
        System.out.println("Photography Prop: " + name + ", Category: " + category);
    }
}

interface PropTask {
    void performTask(PhotographyProp prop);

    String getTaskDescription();
}

class RentingTask implements PropTask {
    @Override
    public void performTask(PhotographyProp prop) {
        System.out.println("Renting out " + prop.getName());
    }

    @Override
    public String getTaskDescription() {
        return " is being rented out";
    }
}

class ReturningTask implements PropTask {
    @Override
    public void performTask(PhotographyProp prop) {
        System.out.println("Returning " + prop.getName());
    }

    @Override
    public String getTaskDescription() {
        return " is being returned";
    }
}

class CheckingAvailabilityTask implements PropTask {
    @Override
    public void performTask(PhotographyProp prop) {
        System.out.println("Checking availability of " + prop.getName());
    }

    @Override
    public String getTaskDescription() {
        return " availability is being checked";
    }
}

class PropStoreManager {
    private List<PhotographyProp> propStore;
    private List<String> performedTasks;
    private String currentTask;

    public PropStoreManager(List<PhotographyProp> propStore) {
        this.propStore = propStore;
        this.performedTasks = new ArrayList<>();
        this.currentTask = "";
    }

    public void performTask(PhotographyProp prop, PropTask task) {
        task.performTask(prop);
        currentTask = prop.getName() + task.getTaskDescription();
        performedTasks.add(currentTask);
    }

    public List<String> getPerformedTasks() {
        return performedTasks;
    }

    public String getCurrentTask() {
        return currentTask;
    }

    public void clearTasks() {
        performedTasks.clear();
        currentTask = "";
    }

    public List<PhotographyProp> getPropStore() {
        return propStore;
    }
}

public class PropStoreMain extends JFrame {
    private JComboBox<String> propComboBox;
    private JComboBox<String> taskComboBox;
    private JLabel actionLabel;
    private JButton performTaskButton;
    private JButton clearTasksButton;
    private PropStoreManager propStoreManager;

    public PropStoreMain() {
        List<PhotographyProp> propStore = new ArrayList<>();
        propStore.add(new PhotographyProp("Vintage Camera", "Cameras"));
        propStore.add(new PhotographyProp("Portrait Lens", "Lenses"));
        propStore.add(new PhotographyProp("Backdrop Stand", "Stands"));

        propStoreManager = new PropStoreManager(propStore);

        setTitle("Photography Prop Store Management System");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        propComboBox = new JComboBox<>(propStore.stream().map(PhotographyProp::getName).toArray(String[]::new));
        taskComboBox = new JComboBox<>(new String[]{"Renting", "Returning", "Checking Availability"});
        actionLabel = new JLabel("Current Action: ");
        performTaskButton = new JButton("Perform Task");
        clearTasksButton = new JButton("Clear All Tasks");

        performTaskButton.addActionListener(e -> performTask());
        clearTasksButton.addActionListener(e -> clearTasks());

        setLayout(new GridLayout(4, 2));

        add(new JLabel("Choose Photography Prop: "));
        add(propComboBox);
        add(new JLabel("Choose Task: "));
        add(taskComboBox);
        add(performTaskButton);
        add(clearTasksButton);
        add(actionLabel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void performTask() {
        String selectedProp = (String) propComboBox.getSelectedItem();
        String selectedTask = (String) taskComboBox.getSelectedItem();

        PhotographyProp selectedPropObject = propStoreManager.getPropStore().stream()
                .filter(prop -> prop.getName().equals(selectedProp))
                .findFirst().orElse(null);

        if (selectedPropObject != null) {
            PropTask rentingTask = new RentingTask();
            PropTask returningTask = new ReturningTask();
            PropTask checkingAvailabilityTask = new CheckingAvailabilityTask();

            PropTask task;
            switch (selectedTask) {
                case "Renting":
                    task = rentingTask;
                    break;
                case "Returning":
                    task = returningTask;
                    break;
                case "Checking Availability":
                    task = checkingAvailabilityTask;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown task type: " + selectedTask);
            }

            propStoreManager.performTask(selectedPropObject, task);
            updateUI();
        }
    }

    private void clearTasks() {
        propStoreManager.clearTasks();
        updateUI();
    }

    private void updateUI() {
        actionLabel.setText("Current Action: " + propStoreManager.getCurrentTask());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PropStoreMain());
    }
}
