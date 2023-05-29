package generic.tireGenericPractice;

public class Claymore extends Job {

    private String clayMore;

    public Claymore(String name, String job, String clayMore) {
        super(name, job);
        this.clayMore = clayMore;
    }

    public String getClayMore() {
        return clayMore;
    }

    public void setClayMore(String clayMore) {
        this.clayMore = clayMore;
    }

    public void printInfo() {

        System.out.println("name=" + getName());
        System.out.println("class=" + getJob());
        System.out.println("weapon=" + getClayMore());
        System.out.println("BigSword Attack");

    }


}
