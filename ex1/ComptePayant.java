public class ComptePayant extends CompteBancaire {
    private static final double COUT_OPERATION = 5;

    public ComptePayant(double solde, Client proprietaire, Agence agence) {
        super(solde, proprietaire, agence);
    }

    @Override
    public void deposer(double montant) {
        super.deposer(montant - COUT_OPERATION);
    }

    @Override
    public void retirer(double montant) {
        super.retirer(montant + COUT_OPERATION);
    }

    @Override
    public String toString() {
        return "ComptePayant " + super.toString();
    }
}
