package com.ohgiraffers.section02.reflection;

public class Account {
     private String backCode;
     private String accNo;
     private String accPwd;
     private int balance;

    public Account() {
    }


    public Account(String backCode, String accNo, String accPwd, int balance) {
        this.backCode = backCode;
        this.accNo = accNo;
        this.accPwd = accPwd;
        this.balance = balance;
    }
    public String getBackCode() {
        return backCode;
    }

    public void setBackCode(String backCode) {
        this.backCode = backCode;
    }

    @Override
    public String toString() {
        return "Account{" +
                "backCode='" + backCode + '\'' +
                ", accNo='" + accNo + '\'' +
                ", accPwd='" + accPwd + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccPwd() {
        return accPwd;
    }

    public void setAccPwd(String accPwd) {
        this.accPwd = accPwd;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
