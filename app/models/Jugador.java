package models;
import play.db.jpa.Model;

import javax.persistence.*;

@Entity
public class Jugador extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private int edat;
    private String dni;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equip_id")          //Foreign key
    private Equip equip;

    public Jugador(String nom, int edat, String dni) {
        this.nom = nom;
        this.edat = edat;
        this.dni= dni;
    }

    @Override
    public Long getId() { return id; }

    public static Jugador trobarJugador(String nom, String dni) {
        return find("byNomAndDni", nom, dni).first();
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
