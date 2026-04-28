public class Main {
    public static void main(String[] args) {
        // Instanciation des 3 classes enfants
        CheckingAccount checking = new CheckingAccount("CH-998", 1500.0, 500.0);
        SavingsAccount savings = new SavingsAccount("SA-123", 5000.0);
        COD cod = new COD("COD-456", 10000.0);

        // Démonstration de l'accès aux attributs hérités (Définir et Lire)
        System.out.println("--- Test des comptes ---");

        // Modification via setters hérités
        checking.setBalance(1650.75);

        // Lecture via getters hérités
        System.out.println("Compte Courant N°: " + checking.getAccount() + " | Solde: " + checking.getBalance() + " | Limite: " + checking.getLimit());
        System.out.println("Compte Épargne N°: " + savings.getAccount() + " | Solde: " + savings.getBalance());
        System.out.println("Compte COD N°: " + cod.getAccount() + " | Solde: " + cod.getBalance());
    }
}