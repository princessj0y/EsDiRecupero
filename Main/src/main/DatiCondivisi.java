/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 *
 * @author Padua
 */
public class DatiCondivisi {
    private int numero;
    private Random rndm=new Random();
    private int punteggioGiocatore1,punteggioGiocatore2;
    private boolean fine;
    
    public DatiCondivisi() {
        numero=rndm.nextInt(6)+1;
        punteggioGiocatore1=0;
        punteggioGiocatore2=0;
        fine=false;
    }

    public int getNumero() {
        return numero;
    }

    public int getPunteggioGiocatore1() {
        return punteggioGiocatore1;
    }

    public int getPunteggioGiocatore2() {
        return punteggioGiocatore2;
    }

    public boolean isFine() {
        return fine;
    }

    public void setFine(boolean fine) {
        this.fine = fine;
    }
    
    /*-------------METODI-------------*/
    public void incGiocatore1() {
        punteggioGiocatore1++;
    }
    public void incGiocatore2() {
        punteggioGiocatore2++;
    }
    
}
