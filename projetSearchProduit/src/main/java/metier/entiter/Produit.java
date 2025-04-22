package metier.entiter;

import java.io.Serializable;

public class Metiere  implements Serializable {
    private Long Id;
    private String destenation ;
    private double prix ;
    private int quantite ;

    public Metiere(Long id, String destenation, double prix, int quantite) {
        Id = id;
        this.destenation = destenation;
        this.prix = prix;
        this.quantite = quantite;
    }

    public Metiere() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDestenation() {
        return destenation;
    }

    public void setDestenation(String destenation) {
        this.destenation = destenation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
