package anonymousClass.shoes;

public class Shoes {

    private Brand brand1 = new Brand();

    private Brand brand2 = new Brand(){
        @Override
        public void wear(){
            System.out.println("익명자식 Brand 객체 1이 신발은 신습니다");
        }
    };

    public void wearing1() {

        brand1.wear();
        brand2.wear();

    }

    public void wearing2(){
        Brand brand = new Brand(){

            @Override
            public void wear(){
                System.out.println("익명 자식 Brand 객체 2가 신발을 신습니다");

            }


        };
        brand.wear();
    };

    public void wearing3(Brand brand){
        brand.wear();
    };


}
