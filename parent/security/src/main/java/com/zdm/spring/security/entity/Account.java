package com.zdm.spring.security.entity;

public class Account {
    private String name;
    private String sex;
    private Integer accountNumber;
    private Integer money;

    public Account(String name, String sex, Integer accountNumber, Integer money) {
        this.name = name;
        this.sex = sex;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
