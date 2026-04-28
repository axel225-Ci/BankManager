public class BankAccount {
    protected String account; // Numéro de compte
    protected double balance; // Solde du compte

    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    // Getters et Setters pour lire et définir les attributs
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}