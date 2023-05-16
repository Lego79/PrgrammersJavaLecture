package kart;

public class KartApp {

    public static void main(String[] args) {

        Kart kart = new Kart("Burst", "Green");

        System.out.println("==== ready ====");

        kart.printKartInfo();

        System.out.println("==== run ====");
        kart.speedUp();
        kart.speedUp();
        kart.pickupBooster();
        kart.pickupBooster();
        kart.useBooster();
        kart.useBooster();
        kart.speedDown();
        kart.speedDown();








    }

}
