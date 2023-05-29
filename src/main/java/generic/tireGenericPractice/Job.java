package generic.tireGenericPractice;

public class Job {

    private String name;
    private String job;


    public Job(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    public void printInfo() {

        System.out.println("name=" + getName());
        System.out.println("class=" + getJob());

    }
}
