package personal;

public class Main {
    public static void main(String[] args)
    {
       Person person1 = new Person("Zé", 0.00, 3.65);
       Bank bank = new Bank("banco ctt");
       bank.setBankName("test");
       System.out.println(person1.getBalance());
       person1.addMoneyToBank(bank,4.35);
       System.out.println(person1.getBalance());
       System.out.println(bank.checkInDebt(person1));;

    }
}
