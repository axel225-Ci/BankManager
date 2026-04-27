public class Main {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount("CH-998", 1500.0, 500.0);
        SavingsAccount savings = new SavingsAccount("SA-123", 5000.0);
        COD cod = new COD("COD-456", 10000.0);

        System.out.println("--- Test des comptes ---");

        checking.setBalance(1650.75);

        System.out.println("Compte Courant N°: " + checking.getAccount() + " | Solde: " + checking.getBalance() + " | Limite: " + checking.getLimit());
        System.out.println("Compte Épargne N°: " + savings.getAccount() + " | Solde: " + savings.getBalance());
        System.out.println("Compte COD N°: " + cod.getAccount() + " | Solde: " + cod.getBalance());
    }
}