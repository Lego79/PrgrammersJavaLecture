package generic.tireGenericPractice;

public class EquipmentApp {

    public static void main(String[] args) {

        System.out.println("===== Basic class =====");
        Job j1 = new Job("Hans", "Civil");
        j1.printInfo();

        System.out.println("\n===== Armed Claymore =====");
        Claymore c1 = new Claymore("Dark","Knight","Big Sword");
        Equip<Claymore> w1 = new Equip<Claymore>(c1);
        Claymore claymore1 = w1.getWeapon();
        claymore1.printInfo();

        System.out.println("\n===== Armed Claymore =====");
        Katana katana = new Katana("Kato", "Samurai", "JapanSword");
        Equip<Katana> equip1 = new Equip<>(katana);
        Katana katana1 = equip1.getWeapon();
        katana1.printInfo();

        System.out.println("\n===== Armed Revolver =====");
        Gun gun = new Gun("Reaper", "Killer", "6hole Revolver");
        Equip<Gun> equip3 = new Equip<>(gun);
        Gun gunSling = equip3.getWeapon();
        gunSling.printInfo();

        System.out.println("\n===== Worn Boots =====");
        Boots boots = new Boots("Jayden", "Civil", "Leather Boots");
        Equip<Boots> boots1 = new Equip<>(boots);
        Boots boots2 = boots1.getWeapon();
        boots2.printInfo();




    }



}
