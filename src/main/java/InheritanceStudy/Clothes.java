package InheritanceStudy;

public class Clothes {

    private String product;
    private String color;
    private String company;


    public Clothes(String product, String color, String company) {
        this.product = product;
        this.color = color;
        this.company = company;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void printInfo() {

        System.out.println("\n==== Clothes Info ====");
        System.out.print("Product = " + getProduct());
        System.out.print(" | " + "Color = " + getColor());
        System.out.print(" | " + "Company = " + getCompany());



    }

}
