package com.company;

public class Lop3D extends Lop2D{
    private float z;
    public Lop3D(){}
    public Lop3D(float x,float y,float z){
        super(x,y);
        this.z =z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        setZ(z);
    }
    public Lop3D getXYZ(){
       return new Lop3D(super.getX(), super.getY(), this.getZ());
    }

    @Override
    public String toString() {
        return "{" +super.toString()+", "+
                "z=" + z +
                '}';
    }
}
