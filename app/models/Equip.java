package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Equip extends Model {
private String nom;
private String nomEquip;

    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public String getNomEquip() { return nomEquip; }

    public void setNomEquip(String nomEquip) { this.nomEquip = nomEquip; }

    public Equip(String nom, String nomEquip) {
        this.nom = nom;
        this.nomEquip = nomEquip;
    }
}
