/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Padua
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
            DatiCondivisi dati=new DatiCondivisi();
            ThGiocatore1 thGiocatore1=new ThGiocatore1(dati);
            ThGiocatore2 thGiocatore2=new ThGiocatore2(dati);
            
        System.out.println("INIZIO MAIN- NUMERO GENERATO:"+dati.getNumero());  
            thGiocatore1.start();
            thGiocatore2.start();
        try {  
            thGiocatore1.join();
            thGiocatore2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("FINE MAIN");       
               
    }
    
}
