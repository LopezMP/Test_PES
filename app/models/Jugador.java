package models;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Jugador extends Model {
    private String nom;
    private int edat;

    public Jugador(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    public Jugador() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
}
