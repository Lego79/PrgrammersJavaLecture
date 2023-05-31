package personListScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Manager {

    private List<Person> personList;



    public Manager(List<Person> personList) {
        this.personList = personList;
    }

    public Manager() {
        this.personList = new ArrayList<>();
    }

//    public void printPersonList() {
//        System.out.println("[전체 출력]");
//        for (Person person : personList) {
//            person.printInfo();
//            System.out.println();
//        }
//    }

    public void printPersonList() {
        System.out.println("[전체 출력]");
        int cnt = 1;
        for(int i=0; i < personList.size(); i++) {

            System.out.print(cnt + "." + "아이디=" + personList.get(i).getId());
            System.out.print(" | 이름="+ personList.get(i).getName());
            System.out.print(" | 나이="+ personList.get(i).getAge());
            System.out.println(" | 성별="+ personList.get(i).getSex());
            cnt++;

        }
    }
    public void addPerson(Scanner sc) {
        System.out.print("ID를 입력하세요 => ");
        String id = sc.nextLine();
        System.out.print("이름을 입력하세요 =>  ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 =>  ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("성별을 입력하세요 => ");
        String sex = sc.nextLine();

        Person person = new Person(id, name, age, sex);
        personList.add(person);
    }

    public void updatePerson(Scanner sc) {

    }

    public void deletePerson(Scanner sc) {

    }

    public void selectPersonBySex(Scanner sc) {

    }

    public void selectPersonByBetweenAge(Scanner sc) {

    }




}
