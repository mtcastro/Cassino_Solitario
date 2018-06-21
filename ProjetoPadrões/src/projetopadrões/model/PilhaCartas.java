/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrões.model;

import java.util.ArrayList;

public class PilhaCartas {
    private Regra regra;
    private ArrayList<Carta> cartas;

    public PilhaCartas(Regra regra, ArrayList<Carta> cartas) {
        this.regra = regra;
        this.cartas = cartas;
    }
    
    public void addCarta (Carta carta){
        
    }
}
