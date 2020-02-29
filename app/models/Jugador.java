package models;
import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Jugador extends Model {
    private String nom;
    private int edat;
    private String dni;

    public Jugador(String nom, int edat, String dni) {
        this.nom = nom;
        this.edat = edat;
        this.dni= dni;
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

    public String getDni() { return dni; }

    public void setDni(String dni) { this.dni = dni; }
}
