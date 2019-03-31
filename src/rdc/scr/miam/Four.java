package rdc.scr.miam;

import rdc.scr.miam.*;

public class Four {
    public  int puissance ;

    public int capacite;

    public void cuire(Aliment aliment){
        System.out.println("Je cuis un aliment" +aliment.nom);

        System.out.println("avec ma capaciter de " + capacite+" litres");

        System.out.println("et ma puissance de "+ puissance + " degres");

        aliment.estCuit = true;

    }
}
