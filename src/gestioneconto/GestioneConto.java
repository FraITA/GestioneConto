/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneconto;

/**
 *
 * @author user
 */
public class GestioneConto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente();
        
        for(int i = 0;i<5;++i){
            new Correntista("Persona " + (i+1), conto).start();
        }
    }
    
}
