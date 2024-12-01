public class EmployeHoraire extends Employe {
    private int heuresTravaillees;
    private double tarifHoraire;

    public EmployeHoraire(String matricule, String nom, String adresse) {
        super(matricule, nom, adresse);
    }

    public EmployeHoraire(String matricule, String nom, String adresse, int heuresTravaillees, double tarifHoraire) {
        super(matricule, nom, adresse);
        this.heuresTravaillees = heuresTravaillees;
        this.tarifHoraire = tarifHoraire;
        setSalaire();
    }

    @Override
    public void setSalaire() {
        setSalaire(heuresTravaillees * tarifHoraire);
    }

    @Override
    public String toString() {
        return super.toString() + ", Type=Horaire, Heures=" + heuresTravaillees + ", Tarif Horaire=" + tarifHoraire;
    }
}
