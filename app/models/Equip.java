package models;

import play.db.jpa.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Equip extends Model {
/*    @OneToMany(fetch = FetchType.LAZY, mappedBy = "equip")
    private List<Jugador> jugadors;
*/
    private String nom;
    private String nomEstadi;

    @Override
    public Long getId() { return id; }

    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public String getNomEstadi() { return nomEstadi; }

    public void setNomEstadi(String nomEstadi) { this.nomEstadi = nomEstadi; }

    public List<Jugador> getJugadors() { return jugadors;}

    public void setJugadors(List<Jugador> jugadors) { this.jugadors = jugadors; }

    public void afegirJugador(Jugador jugador){ this.jugadors.add(jugador);}


    public static Equip trobarEquip(String nom) {
        return find("byNom", nom).first();
    }
    public Equip(String nom, String nomEstadi) {
        this.nom = nom;
        this.nomEstadi = nomEstadi;
        this.jugadors= new ArrayList<Jugador>();
    }

    public Equip(String nom, String nomEstadi, List<Jugador> jugadorList) {
        this.nom = nom;
        this.nomEstadi = nomEstadi;

        this.jugadors= new ArrayList<Jugador>();
        this.jugadors = jugadorList;
    }


}
