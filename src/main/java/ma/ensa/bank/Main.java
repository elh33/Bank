package ma.ensa.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Création de deux banques
            Banque banque1 = new Banque(1, "Maroc");
            Banque banque2 = new Banque(2, "France");

            // Création de comptes pour les clients
            Compte compte1 = new Compte(12345, new Date(), new Date(), "MAD");
            Compte compte2 = new Compte(67890, new Date(), new Date(), "EUR");

            // Création de listes de comptes
            List<Compte> comptes1 = new ArrayList<>();
            comptes1.add(compte1);
            List<Compte> comptes2 = new ArrayList<>();
            comptes2.add(compte2);

            // Création de deux clients dans des banques et pays différents
            Client client1 = new Client(101, "Ali", "Le Blanc", "Adresse 1", "0600000000", "ali@example.com", banque1, comptes1);
            Client client2 = new Client(102, "Jean", "Smoke", "Adresse 2", "0600000001", "jean@example.com", banque2, comptes2);

            // Conversion en JSON et affichage pour Client
            String clientJson = client1.toJson();
            System.out.println("Client 1 en JSON : " + clientJson);

            Client clientFromJson = Client.fromJson(clientJson);
            System.out.println("Client désérialisé depuis JSON : " + clientFromJson);

            // Conversion en JSON et affichage pour Compte
            String compteJson = compte1.toJson();
            System.out.println("Compte en JSON : " + compteJson);

            Compte compteFromJson = Compte.fromJson(compteJson);
            System.out.println("Compte désérialisé depuis JSON : " + compteFromJson);

            // Conversion en JSON et affichage pour Banque
            String banqueJson = banque1.toJson();
            System.out.println("Banque en JSON : " + banqueJson);

            Banque banqueFromJson = Banque.fromJson(banqueJson);
            System.out.println("Banque désérialisée depuis JSON : " + banqueFromJson);

            // Création de la transaction avec type calculé automatiquement
            Transaction transaction = new Transaction(client1, client2, new Date(), "REF123");

            // Affichage de la transaction en JSON
            String transactionJson = transaction.toJson();
            System.out.println("Transaction en JSON : " + transactionJson);

            Transaction transactionFromJson = Transaction.fromJson(transactionJson);
            System.out.println("Transaction désérialisée depuis JSON : " + transactionFromJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
