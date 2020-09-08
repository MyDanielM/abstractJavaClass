package com.mydanielm;

public class Triangle extends Figure{

    private final float a;
    private final float b;
    private final float c;

    Triangle(float x, float y, float a, float b, float c){
        super(x,y);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public float getArea() {
        float p = getPerimeter()/2;
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public float getPerimeter() {
        return a+b+c;
    }

    @Override
    public void display() {
        System.out.print("Треугольник. \n");
        System.out.printf("x: %f, y: %f.\n",this.x,this.y);
        System.out.printf("Периметр: %f\n",this.getPerimeter());
        System.out.printf("Площадь: %f",this.getArea());
        System.out.println();
    }
}
