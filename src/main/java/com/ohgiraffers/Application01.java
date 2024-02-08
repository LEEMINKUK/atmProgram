package com.ohgiraffers;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        Person per = new Person();
        Scanner sc = new Scanner(System.in);
        per.accountBalance = 0;


        while (true) {
            System.out.println("========== A T M 프로그램 ===========");
            System.out.println("1. 카드 삽입");
            System.out.println("2. 입    금");
            System.out.println("3. 출    금");
            System.out.println("4. 카드 뽑기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    per.insertCard();
                    break;
                case 2:
                    per.InsertMoney();
                    break;
                case 3:
                    per.GetMoney();
                    break;
                case 4:
                    per.cardInjection();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
                    break;
            }
            if (no == 9) {
                break;

            }
        }
    }
}