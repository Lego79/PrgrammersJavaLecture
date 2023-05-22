package InheritanceStudy;

public class ClothesApp {

    public static void main(String[] args) {

        Clothes c = new Clothes("Padding", "white","Buckeroo");
        c.printInfo();

        Shirts s = new Shirts("cotton Rinnen shirts", "blue", "MindBridge", "Long Sleeve", "XL");
        s.printInfo();

        Pants p = new Pants("WrinkleFree pants", "Black", "Giodarno", "Long Pants");
        p.printInfo();


    }
}
