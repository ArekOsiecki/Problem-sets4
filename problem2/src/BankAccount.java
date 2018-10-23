public abstract class BankAccount implements TransactableInterface, Taxable{

    protected String name;
    protected int accNum;

    public void setName(String name){
        this.name=name;
    }
    public void setAccNum(int accNum){
        this.accNum=accNum;
    }

    public String getName(){
        return name;
    }
    public int getAccNum(){
        return accNum;
    }


    public abstract void lodge(double amount);
    public abstract void withdraw(double amount);
    public abstract double  calcTax();

    public BankAccount()
    {
        name = "";
        accNum=0;
    }

    public BankAccount(String name,int accNum)
    {
        this.accNum = accNum;
        this.name = name;
    }

    //other methods potentially

}
