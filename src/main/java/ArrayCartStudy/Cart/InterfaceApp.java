package ArrayCartStudy.Cart;

class RealCal{

    public double plus(double v1, double v2, double v3) {

        return v1+v2+v3;
    }


}

interface Calculable  {

    int sum(int v1, int v2);

}

class DummyCal implements Calculable {

    public int sum(int v1, int v2) {
        return 3;
    }
}

public class InterfaceApp {

    public static void main(String[] args) {

        RealCal c = new RealCal();
        System.out.println(c.sum(2,1));



    }
}
