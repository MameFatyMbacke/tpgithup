package main;

import controller.ITransfert;
import controller.transfertImpl;
import entities.Transfert;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ITransfert transf2 = new transfertImpl();
        ArrayList<Transfert> transf3 = (ArrayList<Transfert>) transf2.saisie();
        transf2.affichage((List<Transfert>) transf3);

    }
}

