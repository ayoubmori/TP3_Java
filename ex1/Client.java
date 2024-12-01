import java.util.ArrayList;
import java.util.List;

public class Client {
    private static int compteur = 0;
    private String idClient;
    private String nom;
    private String prenom;
    private String adresse;
    private Agence agence;
    private List<CompteBancaire> comptes;

    public Client(String nom, String prenom, String adresse, Agence agence) {
        compteur++;
        this.idClient = "Client:" + compteur;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.agence = agence;
        this.comptes = new ArrayList<>();
    }

    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
    }

    public List<CompteBancaire> getComptes() {
        return comptes;
    }

    public double getSoldeTotal() {
        return comptes.stream().mapToDouble(CompteBancaire::getSolde).sum();
    }

    @Override
    public String toString() {
        return "Client [ID=" + idClient + ", Nom=" + nom + ", Prénom=" + prenom + ", Adresse=" + adresse + ", Agence=" + agence + "]";
    }
}
