package personal;

public class Person {
    private String name;
    private double balance;
    private double money;

    public Person(String name, double balance, double money) {
        this.name = name;
        this.balance = balance;
        this.money = money;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getMoney(){
        return this.money;
    }

    public double addMoneyToBank(Bank bank, double someValue){
        this.balance += someValue;
        return this.balance;
    }



}

