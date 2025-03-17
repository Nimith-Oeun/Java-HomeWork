package oop.homework;

public class AccountImpl implements Service{
    private String name;
    private Boolean isXchange = false;
    private Double balance = 0.0;
    private Double amountToReil = 0.0;




    public AccountImpl(String name){
        this.name = name;
    }
    public double getBalance() {
        return balance;
    }
    public Double getAmountToReil() {
        return amountToReil;
    }
    public String getName() {
        return name;
    }
    public Boolean getIsXchange() {
        return isXchange;
    }
    @Override
    public double deposit(Double amount) {
        if (amount < 0) {
            System.out.println(name +"Invalid amount");
        }else {
            balance += amount;
            System.out.println("Deposit successfully");
        }
        return balance;
    }

    @Override
    public double withdraw(Double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw successfully");
        }else {
            System.out.println("Invalid amount");
        }
        return balance;
    }

    @Override
    public void currentBalance() {
       System.out.println(name +" Current balance: " + balance);
    }

    @Override
    public double exchangeToReil(Double amount) {
        if (amount > balance){
            System.out.println("Your don't have enough money to exchange");
        }else {
            amountToReil = amount * 4000;
            balance -= amount;
            isXchange = true;
            System.out.println("Exchanged amount: " + amountToReil + " Riel");
        }
        return amountToReil;
    }

    @Override
    public double exchangeToDollar(Double amount) {
        double amountToDolla = 0.0;
        if (amount > amountToReil){
            System.out.println("Your don't have enough money to exchange");
        }else {
            amountToDolla = amount / 4000;
            amountToReil-= amount;
            balance += amountToDolla;
            isXchange = true;
            System.out.println("Exchanged amount: " + amountToDolla + " Dollar");
            System.out.println("Current balance: " + amountToReil+ " Riel");
        }
        return balance;
    }


}
