import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ApplicationBancaire {
    public static void main(String[] args) {
        // 1 - création de l'agence 
        Agence agence = new Agence("Adresse X");

        // 2
        List<Client> clients = new ArrayList<>();

        // création des clients et de leurs comptes
        Client client1 = new Client("Ali", "Ahmed", "Adresse1", agence);
        CompteEpargne compte1 = new CompteEpargne(1000, client1, agence);
        client1.ajouterCompte(compte1);

        Client client2 = new Client("Sara", "Mohamed", "Adresse2", agence);
        ComptePayant compte2 = new ComptePayant(2500, client2, agence);
        client2.ajouterCompte(compte2);

        Client client3 = new Client("Zara", "Amine", "Adresse3", agence);
        ComptePayant compte3a = new ComptePayant(0, client3, agence);
        client3.ajouterCompte(compte3a);
        ComptePayant compte3b = new ComptePayant(3000, client3, agence);
        client3.ajouterCompte(compte3b);

        Client client4 = new Client("Omar", "Youssef", "Adresse4", agence);
        CompteEpargne compte4a = new CompteEpargne(2300, client4, agence);
        client4.ajouterCompte(compte4a);
        ComptePayant compte4b = new ComptePayant(0, client4, agence);
        client4.ajouterCompte(compte4b);

        // Ajout des clients 
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);
        clients.add(client4);

        // C - 
        compte1.deposer(200);
        System.out.println(client1.getComptes());

        // D -
        compte1.retirer(300);
        System.out.println(client1.getComptes());

        System.out.println(agence);

        // Affich des infos de l'agence
        System.out.println("=== Informations sur l'Agence Bancaire ===");
        System.out.println(agence);
        System.out.println();

        // Affich des clients et comptes
        System.out.println("=== Liste des Clients et leurs Comptes ===");
        for (Client client : clients) {
            System.out.println(client);
            for (CompteBancaire compte : client.getComptes()) {
                System.out.println("    " + compte);
            }
            System.out.println("    Solde total : " + client.getSoldeTotal() + " DH");
            System.out.println();
        }

        // affich des comptes d'épargne
        System.out.println("=== Liste des Comptes d'Épargne ===");
        clients.forEach(client -> client.getComptes().stream()
            .filter(compte -> compte instanceof CompteEpargne)
            .forEach(compte -> System.out.println(compte)));
        System.out.println();

        // affich des comptes payants
        System.out.println("=== Liste des Comptes Payants ===");
        clients.forEach(client -> client.getComptes().stream()
            .filter(compte -> compte instanceof ComptePayant)
            .forEach(compte -> System.out.println(compte)));
        System.out.println();

        // classement des clients par solde total
        System.out.println("=== Classement des Clients par Solde Total ===");
        clients.stream()
            .sorted(Comparator.comparingDouble(Client::getSoldeTotal).reversed())
            .forEach(client -> System.out.println(client + " - Solde Total : " + client.getSoldeTotal() + " DH"));
    }
}
