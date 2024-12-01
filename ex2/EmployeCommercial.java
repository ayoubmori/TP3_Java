public class EmployeCommercial extends Employe {
    private double montantFixe;

    public EmployeCommercial(String matricule, String nom, String adresse) {
        super(matricule, nom, adresse);
    }

    public EmployeCommercial(String matricule, String nom, String adresse, double montantFixe) {
        super(matricule, nom, adresse);
        this.montantFixe = montantFixe;
        setSalaire();
    }

    @Override
    public void setSalaire() {
        setSalaire(montantFixe);
    }

    @Override
    public String toString() {
        return super.toString() + ", Type=Commercial, Montant Fixe=" + montantFixe;
    }
}
