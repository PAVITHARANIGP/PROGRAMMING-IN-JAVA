import lab_2.Prop;

public class Main {
    public static void main(String[] args) {
        Prop P1 = new Prop();
        Prop P2 = new Prop("CompanyABC", "Bangalore", 10, "Basket", "Bamboo", 1000);

        System.out.println("\nWorks");
        P2.work();
        P2.work(10);
        P2.work("Birthday Party");

        System.out.println("\nDetails");
        P2.showDetails();
    }
}
