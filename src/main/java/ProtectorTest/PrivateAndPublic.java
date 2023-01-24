package ProtectorTest;

public class PrivateAndPublic {

    public int p = 3;

    protected int p2=4; //같은 패키지

    private int i = 1; // 자기 자신만, 같은 클래스

    int k = 2; //default 접근 지정자, 자기자신과, 같은 패키지 내에서 접근 가능



}
