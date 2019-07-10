package Practice;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] snack={
                new Snack("새우깡","농심",1100,2),
                new Snack("콘칲","크라운",1200,1),
                new Snack("허니버터칩","해태",1500,4)
        };
        int sum=0;
        for(Snack value : snack){
            System.out.println(value);
            sum+=value.calcPrice(value.getNumber(),value.getPrice());
        }
        System.out.printf("총 구매 금액 : %,d원",sum);
    }
}
