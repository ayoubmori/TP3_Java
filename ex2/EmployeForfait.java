public class EmployeForfait extends Employe {
    private int joursTravaillees;
    private double tarifJournalier;

    public EmployeForfait(String matricule, String nom, String adresse) {
        super(matricule, nom, adresse);
    }

    public EmployeForfait(String matricule, String nom, String adresse, int joursTravaillees, double tarifJournalier) {
        super(matricule, nom, adresse);
        this.joursTravaillees = joursTravaillees;
        this.tarifJournalier = tarifJournalier;
        setSalaire();
    }

    @Override
    public void setSalaire() {
        setSalaire(joursTravaillees * tarifJournalier);
    }

    @Override
    public String toString() {
        return super.toString() + ", Type=Forfait, Jours=" + joursTravaillees + ", Tarif Journalier=" + tarifJournalier;
    }
}
