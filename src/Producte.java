import java.io.Serializable;

public class Producte implements Serializable {
    private String nom;
    private double preu;
    private int quantitat;

    public Producte(String nom, double preu, int quantitat) {
        this.nom = nom;
        this.preu = preu;
        this.quantitat = quantitat;
    }

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }

    public int getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    @Override
    public String toString() {
        return "Producte{" +
                "nom='" + nom + '\'' +
                ", preu=" + preu +
                ", quantitat=" + quantitat +
                '}';
    }
}
