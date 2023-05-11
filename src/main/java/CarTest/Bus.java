package CarTest;

public class Bus extends Car {

    private int seat;

    public Bus(int wheel, int speed, int seat) {
        super(wheel, speed);
        this.seat = seat;
    }


    public void setSpeed(int speed) {
        if(speed > 100 ) {

            System.out.println("과속");

        }   else {

            super.setSpeed(speed);
            System.out.println(speed + "정상속도");

        }
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

}






