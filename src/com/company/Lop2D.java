package com.company;

public class Lop2D {
    private float x;
    private float y;
    public Lop2D(){};
    public Lop2D(float x,float y){
        this.x =x;
        this.y =y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x =x;
        this.y = y;
    }
    public Lop2D getXY(){
        return new Lop2D(this.x,this.y);
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }
}
