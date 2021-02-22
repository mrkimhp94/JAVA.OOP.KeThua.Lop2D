package com.company;

public class TestLop2D {
    public static void main(String[] args) {
        Lop2D lop2D = new Lop2D();
        lop2D = new Lop2D(3.2f,2.3f);
        System.out.println(lop2D.getX());
        System.out.println(lop2D.getY());
        System.out.println(lop2D.getXY());
    }
}
