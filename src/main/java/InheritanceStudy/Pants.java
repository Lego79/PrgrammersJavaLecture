package InheritanceStudy;

public class Pants extends Clothes{

    private String pantsType;

    public Pants(String product, String color, String company, String pantsType) {
        super(product,color,company);
        this.pantsType=pantsType;

    }

    public String getPantsType() {
        return pantsType;
    }

    public void setPantsType(String pantsType) {
        this.pantsType = pantsType;
    }


    public void printInfo() {
        System.out.println("\n==== Pants Info ====");
        System.out.print("Product = " + getProduct());
        System.out.print(" | " +"Color = " + getColor());
        System.out.print(" | " + "Company = " + getCompany());
        System.out.print(" | " + "PantsType = " + getPantsType());

    }
}


