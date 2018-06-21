/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrões.model;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Mt Castro
 */
public class Baralho {
    private Stack<Carta> cartas;

    public Baralho() {
        cartas = new Stack<>();
        this.cartas = this.gerarBaralho();
    }
    
    private Stack<Carta> gerarBaralho(){
        // Representa o Naipe
        
        for(int i = 0; i<4; i++){
            for (int j = 0; j<14; j++){
                Carta c = new Carta(i,j);
                cartas.add(c);
            }
        }
        
        embaralhar();
        return cartas;
    }
    
    private void embaralhar(){
       // fazer  
    }
}
