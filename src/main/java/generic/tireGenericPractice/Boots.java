package generic.tireGenericPractice;

public class Boots extends Job{

    private String boots;


    public Boots(String name, String job, String boots) {
        super(name, job);
        this.boots = boots;
    }

    public String getBoots() {
        return boots;
    }

    public void setBoots(String boots) {
        this.boots = boots;
    }

    public void printInfo() {

        System.out.println("name=" + getName());
        System.out.println("class=" + getJob());
        System.out.println("weapon=" + getBoots());
        System.out.println("Boots are equipped");

    }
}
