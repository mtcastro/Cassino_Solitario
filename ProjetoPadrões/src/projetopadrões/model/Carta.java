/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadrões.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Mt Castro
 */
public class Carta {
    private static final AtomicInteger count = new AtomicInteger(0); 
    
    private int value;
    private int nipe; // transformar em enum
    private int id;
    private boolean isFlip;

    public Carta(int nipe, int valor) {
        this.value = value;
        this.nipe = nipe; // ( 1 -> ♥ ) ( 2 -> ♦ ) ( 3 -> ♣ ) ( 4 -> ♠)
        this.id = count.incrementAndGet(); 
        this.isFlip = false;
    }

    public int getValue() {
        return value;
    }

    public int getNipe() {
        return nipe;
    }

    public int getId() {
        return id;
    }

    public boolean isIsFlip() {
        return isFlip;
    }

    public void setIsFlip(boolean isFlip) {
        this.isFlip = isFlip;
    }  
}
