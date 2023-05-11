package CarTest;

public class Car {



    private int wheel;
    private int speed;

    public Car(int wheel, int speed) {

        setWheel(wheel);
        setSpeed(speed);

    }



    public int getWheel() {

        return wheel;
    }

    public void setWheel(int wheel) {

        this.wheel = this.wheel;
    }
    public int getSpeed() {

        return speed;
    }
    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public void Car(int speed, int wheel) {
        this.speed = speed;
        this.wheel = wheel;
    }

}