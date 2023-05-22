package InheritanceStudy;

public class Shirts extends Clothes {

    private String sleeve;
    private String size;

    public Shirts(String product, String color, String company, String sleeve, String size) {

        super(product,color,company);
        this.sleeve = sleeve;
        this.size = size;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void printInfo() {

        System.out.println("\n==== Shirts Info ====");
        System.out.print("Product = " + getProduct());
        System.out.print(" | " +"Color = " + getColor());
        System.out.print(" | " + "Company = " + getCompany());
        System.out.print(" | " + "SleeveType = " + getSleeve());
        System.out.print(" | " + "Size = " + getSize());

    }
}
