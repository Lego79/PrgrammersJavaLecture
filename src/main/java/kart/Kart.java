package kart;

public class Kart {

    String name;
    String color;
    int speed;
    int booster;

    public Kart(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public void printKartInfo() {
        System.out.println(
                "[" + name + "(" + color + ")]"
                        + "\n SpeedUp 증가 속도 : 40(km)"
                        + "\n SpeedDown 감소 속도 : 80(km)"
                        + "\n 카트 최대 속도 : 150(km)"
                        + "\n 부스터 사용시 증가속도 : 100(km)"
                        + "\n 부스터 최대 개수 : 1(개)"
        );
    }

    public void speedUp() {

        speed += 40;
        if (speed >= 150)
            speed = 150;
        System.out.println("[" + name + "(" + color + ")]" + "speedUP : speed : " + speed + "(km)" + ":" + "noBooster");

    }


    public void pickupBooster() {

        booster += 1;


        if (booster == 1) {
            System.out.println("[" + name + "(" + color + ")]" + "pickupBooster : speed : " + speed + "(km)" + ":" + booster + ":(piece)");
        } else {
            booster = 1;
            System.out.println("[" + name + "(" + color + ")]" + "pickupBooster : speed : " + speed + "(km)" + ":" + booster + ":(piece)" + " : cannot charge booster");
        }
    }

    public void useBooster() {



        if (booster == 1) {
            speed += 100;
            if(speed >= 150)
                speed = 150;
                booster = 0;
            System.out.println("[" + name + "(" + color + ")]" + "useBooster : speed : " + speed + "(km)" + ":" + "booster :" +  booster + ":(piece)");
        } else {
            System.out.println("[" + name + "(" + color + ")]" + "useBooster : speed : " + speed + "(km)" + ":" + "booster :" + booster + ":(piece)" + "No Booster");
        }
    }

    public void speedDown() {

        speed -= 80;
        if(speed < 0) {
            speed = 0;
            booster = 0;
            System.out.println("[" + name + "(" + color + ")]" + "speedDown : speed : " + speed + "(km)" + ":" + "booster :" + booster + ":(piece)");
        } else {
            System.out.println("[" + name + "(" + color + ")]" + "speedDown : speed : " + speed + "(km)" + ":" + "booster :" + booster + ":(piece)");
        }
    }

}













