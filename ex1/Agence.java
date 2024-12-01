import java.util.List;
public class Agence {
    private static int compteur = 0;
    private String idAgence;
    private String adresse;
    private List<Client> clients;


    public Agence(String adresse) {
        compteur++;
        this.idAgence = "Agence:" + compteur;
        this.adresse = adresse;
    }

    public String getIdAgence() {
        return idAgence;
    }

    @Override
    public String toString() {
        return "Agence [ID=" + idAgence + ", Adresse=" + adresse + "]";
    }
}
