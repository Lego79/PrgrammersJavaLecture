package personListScanner;


public class Person {

    public Person(){

    }

    private String id;
    private String name;
    private int age;
    private String sex;

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Person(String id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void printInfo() {

        System.out.print("1.아이디="+getId());
	    System.out.print(" | 이름="+ getName());
	    System.out.print(" | 나이="+ Integer.toString(getAge()));
	    System.out.print(" | 나이="+ getSex());
    }
}
