package com.ohgiraffers;


public class Atm {

    private int accountBalance = 10000;

    public boolean isCard;

    public void insertCard() {
        if (isCard) {
            System.out.println("이미 카드가 삽입되어 있습니다.");
        } else {
            this.isCard = true;
            System.out.println("카드가 삽입 되었습니다.");
        }
    }

    public void cardInjection() {
        if (isCard) {
            this.isCard = false;
            System.out.println("카드를 사출 했습니다.");
        } else {
            System.out.println("삽입된 카드가 없습니다.");
        }
    }

    public void getMoney(int gmo) {
        if (isCard) {
            if (this.accountBalance >= gmo) {
                this.accountBalance -= gmo;
                System.out.println(gmo + " 원이 출금 되었습니다." + "잔액은 : " + accountBalance + " 입니다.");
            } else {
                System.out.println("계좌 잔액이 부족 합니다." + "현재 잔액은 : " + accountBalance + " 입니다.");

            }
        }

    }

    public void insertMoney(int ins) {
        if (isCard) {
            this.accountBalance += ins;
            System.out.println(ins + " 가 입금 되었 습니다." + " 잔액은 : " + accountBalance + " 입니다.");
        } else {
            System.out.println("입금된 금액이 없습니다.");
        }
    }
}
