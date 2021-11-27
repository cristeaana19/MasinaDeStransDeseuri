public class FactoryPattern {

    public static void main(String[] args) {
        WasteFactory wasteFactory = new WasteFactory();

        Waste waste1 = wasteFactory.getWaste("GLASS");
        waste1.trow();
        new Observer1Glass(wasteFactory);

        Waste waste2 = wasteFactory.getWaste("PAPER");
        waste2.trow();
        new Observer2Paper(wasteFactory);

        Waste waste3 = wasteFactory.getWaste("PLASTIC");
        waste3.trow();
        new Oberver3Plastic(wasteFactory);

        Waste waste4 = wasteFactory.getWaste("BIO");
        waste4.trow();
        new Observer4Bio(wasteFactory);

        System.out.println("First state change: 15");
        wasteFactory.setState(15);
        System.out.println("Second state change: 10");
        wasteFactory.setState(10);
    }
}

