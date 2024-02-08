package com.ohgiraffers;

import java.util.Scanner;

public class Person {
    private final Atm atm = new Atm();


    int accountBalance = 0;

    Scanner sc = new Scanner(System.in);

    public void insertCard() {
        atm.insertCard();
    }

    public void cardInjection() {
        atm.cardInjection();
    }

    public void GetMoney() {
        if (atm.isCard) {
            System.out.print("출금할 금액을 입력해 주세요 : ");
            int gmo = sc.nextInt();
            atm.getMoney(gmo);
        } else {
            System.out.println("삽입된 카드가 없습니다. 카드를 삽입해 주세요.");
        }
    }

    public void InsertMoney() {
        if (atm.isCard) {
            System.out.print("입금할 금액을 입력해 주세요 : ");
            int ins = sc.nextInt();
            atm.insertMoney(ins);
        } else {
            System.out.println("삽입된 카드가 없습니다. 카드를 삽입해 주세요");
        }
    }
}
