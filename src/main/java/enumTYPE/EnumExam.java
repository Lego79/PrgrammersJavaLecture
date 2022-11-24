package enumTYPE;

public class EnumExam {

    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;   //static한 필드는 그냥 가져올 수 있다


        gender1 = "boy";

        Gender gender2;

        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE; //타입을 지정 해주면 메일과 피메일만 대입이 가능

        gender2 = "boy";


    }

    enum Gender {
        MALE, FEMALE;
    }


}
