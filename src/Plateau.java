import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Plateau {
    private int nbLignes;
    private int nbColonnes;
    private int pourcentageDeBombes;
    private int nbBombes;
    private List<CaseIntelligente> lePlateau;

    public Plateau(int nbLignes, int nbColonnes, int pourcentage) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.nbBombes = ( nbLignes * nbColonnes ) / pourcentage;
        pourcentageDeBombes = pourcentage;
        lePlateau = new ArrayList<>();
    }

    private void creerLesCasesVides() {

    }

    private void rendLesCasesIntelligentes() {

    }

    protected void poseDesBombesAleatoirement() {
        Random generateur = new Random();
        for (int x = 0; x < this.getNbLignes(); x++) {
            for (int y = 0; y < this.getNbColonnes(); y++) {
                if (generateur.nextInt(100) + 1 < this.pourcentageDeBombes) {
                    this.poseBombe(x, y);
                    this.nbBombes = this.nbBombes + 1;
                }
            }
        }
    }

    public int getNbLignes() {
        return this.nbLignes;
    }

    public int getNbColonnes() {
        return this.nbColonnes;
    }

    public int getNbTotalBombes() {
        return this.nbBombes;
    }

    public Case getCase(int numLigne, int numColonne) {
        CaseIntelligente res = new CaseIntelligente();
        return res;
    }

    public int getNbCasesMarquees() {
        return 0;
    }

    public void poseBombe(int x, int y) {
    }

    public void reset() {

    }
}
