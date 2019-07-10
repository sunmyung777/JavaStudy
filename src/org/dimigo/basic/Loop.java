package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        for문
        for(int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.printf("%d * %d =%2d\t",i,j,i*j);
            }
            System.out.println();
        }
//        for-each문
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int value : arr){
            System.out.println(value);
        }

        String[] BTS ={"슈가","제이홉","남준"};
        for(String value : BTS){
            System.out.println(value);
        }

//        while,do-while
        Scanner scanner= new Scanner(System.in);
        int menu=0;
        do {
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. ITZY");
            System.out.println("2. 빅뱅");
            System.out.println("3. 걸스데이");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 =>");

            menu=scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("ITZY를 선택하셨네요");
                    break;
                case 2:
                    System.out.println("빅뱅을 선택하셨네요");
                    break;
                case 3:
                    System.out.println("걸스데이를 선택하셨네요");
                    break;
                case 9:
                    System.out.println("BYE!");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴네요");
                    break;
            }
        }while(menu!=9);
    }
}
