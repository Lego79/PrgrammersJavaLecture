package generic.tireGenericPractice;

public class Katana extends Job {

    private String katana;


    public Katana(String name, String job, String katana) {
        super(name, job);
        this.katana = katana;
    }

    public String getKatana() {
        return katana;
    }

    public void setKatana(String katana) {
        this.katana = katana;
    }

    public void printInfo() {

        System.out.println("name=" + getName());
        System.out.println("class=" + getJob());
        System.out.println("weapon=" + getKatana());
        System.out.println("JapanSword Attack");

    }

}
