public class TestBankAccount {
    public static void main (String[] args) {
        BankAccount bankAccount = new BankAccount(80.0,160.0);

        System.out.println(bankAccount.getChekingBalance());
        System.out.println(bankAccount.getSavingsBalance());
        System.out.println(bankAccount.getTotalMoney());
        System.out.println("-----------------------------\n");

        bankAccount.depositMoney(20.0,"CHECKING");
        System.out.println(bankAccount.getChekingBalance());
        System.out.println(bankAccount.getTotalMoney());
        System.out.println("-----------------------------\n");

        bankAccount.depositMoney(20.0,"SAVINGS");
        System.out.println(bankAccount.getSavingsBalance());
        System.out.println(bankAccount.getTotalMoney());
        System.out.println("-----------------------------\n");

        bankAccount.withdrawMoney(40.0,"CHECKING");
        System.out.println(bankAccount.getChekingBalance());
        System.out.println(bankAccount.getTotalMoney());
        System.out.println("-----------------------------\n");

        bankAccount.withdrawMoney(40.0,"SAVINGS");
        System.out.println(bankAccount.getSavingsBalance());
        System.out.println(bankAccount.getTotalMoney());
        System.out.println("-----------------------------\n");


    }
}