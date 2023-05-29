package generic.tireGenericPractice;

public class Gun extends Job {

    private String revolver;

    public String getRevolver() {
        return revolver;
    }

    public void setRevolver(String revolver) {
        this.revolver = revolver;
    }

    public Gun(String name, String job, String revolver) {
        super(name, job);
        this.revolver = revolver;


    }

    public void printInfo() {

        System.out.println("name=" + getName());
        System.out.println("class=" + getJob());
        System.out.println("weapon=" + getRevolver());
        System.out.println("Shooting Bullet");

    }

}

