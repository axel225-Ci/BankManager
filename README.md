# BankManager - Exercice Java POO

## Description
Application Java simulant la gestion de différents types de comptes bancaires en utilisant le concept d'**héritage**.
Ce projet a été réalisé sous IntelliJ IDEA sans utiliser de gestionnaire de dépendances (Maven/Gradle).

## Structure du Projet
- `BankAccount`: Classe mère contenant les attributs de base (compte, solde).
- `CheckingAccount`: Sous-classe avec une limite de découvert.
- `SavingsAccount`: Sous-classe pour l'épargne.
- `COD`: Sous-classe pour les certificats de dépôt.
- `Main`: Point d'entrée de l'application pour tester les instances.

## Installation et Exécution
1. Clonez le dépôt : `git clone [TON_LIEN_GITHUB]`
2. Ouvrez le dossier avec **IntelliJ IDEA**.
3. Assurez-vous que le SDK Java (JDK 11 ou plus récent) est bien configuré.
4. Exécutez la classe `Main.java`.