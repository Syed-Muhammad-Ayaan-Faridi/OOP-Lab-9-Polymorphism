class BankAccount{
    protected double interest = 1;
    public double calculateInterest(double balance){
        return balance*(interest/100);
    }
}
class SavingAccount extends BankAccount{
    @Override
    public double calculateInterest(double balance) {
        interest = 5;
        return super.calculateInterest(balance);
    }
}
class CurrentAccount extends BankAccount{
    @Override
    public double calculateInterest(double balance) {
        if (balance > 50000) {
            interest = 2;
        } else interest = 0;
        return super.calculateInterest(balance);
    }
}
class FixedDepositAccount extends BankAccount{
    @Override
    public double calculateInterest(double balance) {
        interest = 8;
        if (balance > 200000) {
            interest += 2;
        }
        return super.calculateInterest(balance);
    }
}
public class Q5 {
    public static void main(String[] args) {
        //Creating Objects
        SavingAccount SA1 = new SavingAccount();
        CurrentAccount CA1 = new CurrentAccount();
        FixedDepositAccount FDA1 = new FixedDepositAccount();
        //Case1 saving account
        System.out.println("Interest in Saving Account: "+SA1.calculateInterest(1536));
        //Case2 Current Account
        System.out.println("Interest in Current Account: "+CA1.calculateInterest(1536));
        System.out.println("Interest in Current Account: "+CA1.calculateInterest(153600));
        //Case3 Fixed Deposit Account
        System.out.println("Interest in Fixed Deposit Account: "+FDA1.calculateInterest(15360));
        System.out.println("Interest in Fixed Deposit Account: "+FDA1.calculateInterest(1536000));
    }
}
