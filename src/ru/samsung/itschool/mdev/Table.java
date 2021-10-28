package ru.samsung.itschool.mdev;

public class Table extends Mebel {

    public Table(String name, int legs) {
        super(name, legs);
    }

    @Override
    public void doMove() {
        System.out.println("Moving table...");
    }
}
