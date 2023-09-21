package com.maven.state.tehtava7;

/**
 *
 * @author tristan
 */
public class Pokemon {
    private int hp;
    private int xp;

    public Pokemon() {
        this.hp = 20;
        this.xp = 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    
    public void growl() {
        System.out.println("ROAR");
    }
    
    public void scratch() {
        System.out.println("SCRATCH");
    }
    
    public void ember() {
        System.out.println("BURN");
    }
    
    public void dragonBreath() {
        System.out.println("Dragon breath burnns");
    }
    
    
}
