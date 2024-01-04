interface Rentable {
    void rent();

    default void performRenting(RentalAction rentalAction) {
        rentalAction.rent();
    }
}

interface RentalAction {
    void rent();
}

class PhotographyProp implements Rentable {
    @Override
    public void rent() {
        System.out.println("Rented a Photography Prop from Photography Prop Store");
    }
}

class StudioEquipment implements Rentable {
    @Override
    public void rent() {
        System.out.println("Rented Studio Equipment from Photography Prop Store");
    }
}

class Photographer<T extends Rentable> {
    void rentEquipment(T rentable, RentalAction rentalAction) {
        System.out.println("Photographer is renting equipment from Photography Prop Store");
        rentable.performRenting(rentalAction);
    }
}

public class PhotographyPropStoreApp7 {
    public static void main(String[] args) {
        Photographer<PhotographyProp> propPhotographer = new Photographer<>();
        Photographer<StudioEquipment> equipmentPhotographer = new Photographer<>();

        PhotographyProp prop = new PhotographyProp();
        StudioEquipment equipment = new StudioEquipment();

        // Using lambda expressions for rental actions
        propPhotographer.rentEquipment(prop, () -> System.out.println("Rental action for Photography Prop"));
        equipmentPhotographer.rentEquipment(equipment, () -> System.out.println("Rental action for Studio Equipment"));
    }
}
