package generic.tireGenericPractice;

public class ArmedWeaponApp {

    public static void main(String[] args) {

        System.out.println("===== Basic class =====");
        Job j1 = new Job("Hans", "Civil");
        j1.printInfo();

        System.out.println("\n===== Armed Claymore =====");
        Claymore c1 = new Claymore("Dark","Knight","Big Sword");
        Box<Claymore> w1 = new Box<Claymore>(c1);
        Claymore claymore1 = w1.getWeapon();
        claymore1.printInfo();

        System.out.println("\n===== Armed Claymore =====");
        Katana katana = new Katana("Kato", "Samurai", "JapanSword");
        Box<Katana> box1 = new Box<>(katana);
        Katana katana1 = box1.getWeapon();
        katana1.printInfo();

        System.out.println("\n===== Armed Revolver =====");
        Gun gun = new Gun("Reaper", "Killer", "6hole Revolver");
        Box<Gun> box3 = new Box<>(gun);
        Gun gunSling = box3.getWeapon();
        gunSling.printInfo();



    }



}
