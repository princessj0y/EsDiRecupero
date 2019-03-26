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
public class ThGiocatore2 extends Thread{
    private DatiCondivisi ptrdati;
    private Random rndm=new Random();
    private int lancioDado;
    
    public ThGiocatore2(DatiCondivisi dati) {
        ptrdati=dati;
    }
    
    public void run() {
        System.out.println("INIZIO THREAD 2");
        while(!ptrdati.isFine()) {
            lancioDado=rndm.nextInt(6)+1;
             System.out.println("Giocatore 2 lancia dado:"+lancioDado);
            if(lancioDado==ptrdati.getNumero()) {
                ptrdati.incGiocatore2();
            }
            lancioDado=rndm.nextInt(6)+1;
             System.out.println("Giocatore 2 lancia dado:"+lancioDado);
            if(lancioDado==ptrdati.getNumero()) {
                ptrdati.incGiocatore2();
            }
            if(ptrdati.getPunteggioGiocatore2()==10) {
                ptrdati.setFine(true);
                System.out.println("HA VINTO GIOCATORE 2");
            }
        }
        System.out.println("FINE THREAD 2");
    }
}
