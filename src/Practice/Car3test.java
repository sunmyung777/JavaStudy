package Practice;

public class Car3test {
    public static void main(String[] args) {
        Car3 a=new Car3("현대자동차","제네시스","검정색",225,50000000);
        Car3 b=new Car3("기아자동차","K7","흰색",246);
        Car3 c=new Car3("삼성자동차","SM7","회색");

        System.out.println("<< 자동차 목록 >>");
        System.out.println("제조사명 : "+a.getCompany());
        System.out.println("모델명 : "+a.getModel());
        System.out.println("색상 : "+a.getColor());
        System.out.println("최대속도 : "+a.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n",a.getPrice());
        System.out.println();
        System.out.println("제조사명 : "+b.getCompany());
        System.out.println("모델명 : "+b.getModel());
        System.out.println("색상 : "+b.getColor());
        System.out.println("최대속도 : "+b.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n",b.getPrice());
        System.out.println();
        System.out.println("제조사명 : "+c.getCompany());
        System.out.println("모델명 : "+c.getModel());
        System.out.println("색상 : "+c.getColor());
        System.out.println("최대속도 : "+c.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원\n",c.getPrice());
    }
}
