public class Paie {
    public static void main(String[] args) {
        Employe[] employes = new Employe[7];

        // Employés horaires
        employes[0] = new EmployeHoraire("H1", "Ali", "Adresse1", 40, 50);
        employes[1] = new EmployeHoraire("H2", "Sara", "Adresse2", 35, 60);

        // Employés au forfait
        employes[2] = new EmployeForfait("F1", "Zara", "Adresse3", 5, 500);
        employes[3] = new EmployeForfait("F2", "Omar", "Adresse4", 4, 400);

        // Employés commerciaux
        employes[4] = new EmployeCommercial("C1", "Ahmed", "Adresse5", 3000);
        employes[5] = new EmployeCommercial("C2", "Youssef", "Adresse6", 2800);
        employes[6] = new EmployeCommercial("C3", "Rania", "Adresse7", 3200);

        // Affichage des salaires
        System.out.println("=== Détails des Salaires Hebdomadaires ===");
        double masseSalariale = 0;
        for (Employe employe : employes) {
            System.out.println(employe);
            masseSalariale += employe.getSalaire();
        }

        // Affichage de la masse salariale
        System.out.println("\n=== Masse Salariale Hebdomadaire ===");
        System.out.println("Masse salariale totale : " + masseSalariale + " DH");
    }
}
