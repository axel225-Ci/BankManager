public class CheckingAccount extends BankAccount {
    private double limit;// Limite de découvert autorisée

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);// Appel du constructeur de BankAccount
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}