package personal;

public class Bank {
    private String bankName;
    private boolean isInDebt;
    private Person person;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public boolean checkInDebt(Person person){
        if(person.getBalance() >= person.getMoney() ){
            isInDebt = false;
            System.out.println("you can withdraw money");
        }
       return isInDebt;
    }


}
