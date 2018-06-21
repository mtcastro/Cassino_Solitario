/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrões.model;

import java.util.ArrayList;

/**
 *
 * @author Mt Castro
 */
public class Regra { // adicionar as relações com herança - interface
    
    public boolean moverCarta(PilhaCartas destino){
        return true;
    }
    
    public boolean moverCartas(ArrayList<Carta> cartas, PilhaCartas destino){
        return true;
    }
}
