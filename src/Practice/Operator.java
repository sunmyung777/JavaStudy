package Practice;

public class Operator {
    public static void main(String[] args) {
        int money=1700000;
        int staff=3;
        int store=1500;
        long hap=(long)money*(long)staff*(long)store*12;
        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.printf("월 평균 급여 : %,d원\n",money);
        System.out.printf("점포 내 직원 수 : %d명\n",staff);
        System.out.printf("점포 수 : %,d개\n\n",store);
        System.out.printf("연간 인건비 : ");
        System.out.println(hap);
    }
}
