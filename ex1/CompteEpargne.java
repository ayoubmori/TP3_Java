public class CompteEpargne extends CompteBancaire {
    private static final double TAUX_INTERET = 0.06;

    public CompteEpargne(double solde, Client proprietaire, Agence agence) {
        super(solde, proprietaire, agence);
    }

    public void calculInteret() {
        deposer(getSolde() * TAUX_INTERET);
    }

    @Override
    public String toString() {
        return "CompteEpargne " + super.toString();
    }
}
