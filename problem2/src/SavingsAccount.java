

public class SavingsAccount extends BankAccount {

    private double balance;
    private String name;
    private int accNum;

    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }


    public String toString(){

        String bankAccount = "Balance: "+getBalance()+"\nName: "+getName()+"\nAccount Number: "+getAccNum()+" \u20ac";
        return bankAccount;
    }

    public SavingsAccount(){


        super();
        setBalance(0.0);
    }

    public SavingsAccount(double balance, String name, int accNum ){


        super(name,accNum);
        setBalance(balance);


    }

    public void lodge(double amount){

        balance+=amount;
    }

    public void withdraw(double amount){

        balance-=amount;
    }

    public double calcTax(){

        double tax = getBalance()*0.15;
        return tax;
    }


}
