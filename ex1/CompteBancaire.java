public abstract class CompteBancaire {
    private static int compteur = 0;
    private String idCompte;
    private double solde;
    private Client proprietaire;
    private Agence agence;

    public CompteBancaire(double solde, Client proprietaire, Agence agence) {
        compteur++;
        this.idCompte = "Compte:" + compteur;
        this.solde = solde;
        this.proprietaire = proprietaire;
        this.agence = agence;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        solde -= montant;
    }

    public double getSolde() {
        return solde;
    }

    @Override
    public String toString() {
        return "Compte [ID=" + idCompte + ", Solde=" + solde + ", Propriétaire=" + proprietaire + ", Agence=" + agence + "]";
    }
}
