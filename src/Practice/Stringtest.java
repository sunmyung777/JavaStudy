package Practice;

import java.util.Random;
import java.util.Scanner;

public class Stringtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[ ] questions = {
                "가장 좋아하는 가수는?",
                "가장 좋아하는 배우는?",
                "가장 좋아하는 과목은?"
        };
        String[] answers = {
                "아이유",
                "원빈",
                "자료구조"
        };
        while(true) {
            System.out.println("------------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 질문 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("------------------");
            System.out.printf("메뉴 선택 => ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    int num = new Random().nextInt(3);
                    System.out.printf("%s ", questions[num]);
                    String dap = scanner.next();
                    if (answers[num].equals(dap)) System.out.println("정답입니다!");
                    else System.out.println("틀렸습니다!");
                    break;

                case 2:
                    System.out.println("<< 정답 출력 >>");
                    for (int i = 0; i < 3; i++) {
                        StringBuilder sb=new StringBuilder();
                        sb.append(questions[i]);
                        sb.append(" ");
                        sb.append(answers[i]);
                        sb.append("입니다.");
                        System.out.println(sb);
                    }
                    break;
                case 9:
                    System.out.println("Bye~");
                    scanner.close();
                    return;
                default:
                    System.out.println("없는 메뉴입니다.");
            }
        }
    }
}
