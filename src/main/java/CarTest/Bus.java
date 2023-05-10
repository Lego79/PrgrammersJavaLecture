package CarTest;

public class Bus extends Car {

    private int seat;

    Bus bus1 = new Bus();



    public int setSpeed() {
        if(bus1.speed > 100 ) {

            return 0;

        }   else {

            return 99;

        }
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

}






