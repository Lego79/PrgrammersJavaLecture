package marine;

public class MarineApp {

    public static void main(String[] args) {

        Marine marine = new Marine("Jim Raynor", 1 , 1);

        System.out.println("==== unit Info ===-");
        System.out.println("name =" + marine.getName());
        System.out.println("HP = " + marine.getHp());
        System.out.println("Damage Upgrade= " + marine.getDamageUpgrade());
        System.out.println("Amor Upgrade " + marine.getArmorUpgrade());

        marine.damageUp();
        marine.damageUp();
        marine.damageUp();
        marine.damageUp();






    }

}
