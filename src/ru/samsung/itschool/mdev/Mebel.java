package ru.samsung.itschool.mdev;

public abstract class Mebel {
    protected String name;
    protected int legs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    Mebel() {

    }

    public Mebel(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public abstract void doMove();
}
