package sn.isi.main;


import sn.isi.entities.Medecin;
import sn.isi.entities.Personne;
import sn.isi.traitement.IMedecin;
import sn.isi.traitement.ImpMedecin;

public class Main {
    public static void main(String[] args) {
        IMedecin me1 = new ImpMedecin();
        Medecin medecin = me1.saisi();
        me1.affichage(medecin);
    }
}
