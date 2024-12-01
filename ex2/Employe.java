public abstract class Employe {
    private String matricule;
    private String nom;
    private String adresse;
    private double salaire;

    public Employe(String matricule, String nom, String adresse) {
        this.matricule = matricule;
        this.nom = nom;
        this.adresse = adresse;
    }

    public Employe(String matricule, String nom, String adresse, double salaire) {
        this(matricule, nom, adresse);
        this.salaire = salaire;
    }

    public abstract void setSalaire();

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employé [Matricule=" + matricule + ", Nom=" + nom + ", Adresse=" + adresse + ", Salaire=" + salaire + "]";
    }
}
