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
public class ThGiocatore1 extends Thread{
    private DatiCondivisi ptrdati;
    private Random rndm=new Random();
    private int lancioDado;
    
    public ThGiocatore1(DatiCondivisi dati) {
        ptrdati=dati;
    }
    
    public void run() {
      
        System.out.println("INIZIO THREAD 1");
        while(!ptrdati.isFine()) {
            lancioDado=rndm.nextInt(6)+1;
            System.out.println("Giocatore 1 lancia dado:"+lancioDado);
            if(lancioDado==ptrdati.getNumero()) {
                ptrdati.incGiocatore1();
            }
            lancioDado=rndm.nextInt(6)+1;
            System.out.println("Giocatore 1 lancia dado:"+lancioDado);
            if(lancioDado==ptrdati.getNumero()) {
                ptrdati.incGiocatore1();
            }
            if(ptrdati.getPunteggioGiocatore1()==10) {
                System.out.println("HA VINTO GIOCATORE 1");
                ptrdati.setFine(true);
            }
        }
        System.out.println("FINE THREAD 1");
    }
}
