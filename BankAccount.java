import java.lang.Math;

public class BankAccount {

    private double chekingBalance ;
    private double savingsBalance ;
    private Long accountNumber;

    private static int NumberOfAccount = 0;
    private static double totalAmountMoneyStored = 0.0;

    public BankAccount(double chekingBalance, double savingsBalance) {
        this.chekingBalance = chekingBalance ;
        this.savingsBalance = savingsBalance;
        this.accountNumber = this.setAccountNumber();
        this.NumberOfAccount ++ ;
    }

    public double getChekingBalance() {
        return this.chekingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void depositMoney (double money, String balanceType) {
        if(balanceType.toUpperCase() == "CHECKING") {
            this.chekingBalance += money;
            this.totalAmountMoneyStored += money;
        }
        else if(balanceType.toUpperCase() == "SAVINGS") {
            this.savingsBalance += money;
            this.totalAmountMoneyStored += money;
        }
        else {
            System.out.println("The balance type should be 'CHECKING' or 'SAVINGS'");
        }
    }

    public void withdrawMoney(double money, String balanceType ) {
        if (balanceType.toUpperCase() == "CHECKING") {
            if (this.chekingBalance >= money) {
                this.chekingBalance -= money ;
                this.totalAmountMoneyStored -= money;
            } 
            else {
                System.out.println("You don't have enough money in your checking balance");
            }
        }
        else if (balanceType.toUpperCase() == "SAVINGS"){
            if(this.savingsBalance >=money) {
                this.savingsBalance -= money ;
                this.totalAmountMoneyStored -=money ;
            }
            else {
                System.out.println("You don't have enough money in your savings balance");
            }
        }
        else {
            System.out.println("The balance type should be 'CHECKING' or 'SAVINGS'");
        }
    }
    
    public double getTotalMoney() {
        return this.chekingBalance + this.savingsBalance;
    }

    public Long setAccountNumber() {
        return (long) (Math.random() * 1000000L);
    }
}