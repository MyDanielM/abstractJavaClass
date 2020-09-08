package com.mydanielm;

public class Rectangle extends Figure {

    private final float width;
    private final float height;

    Rectangle(float x, float y, float width, float height) {
        super(x,y);
        this.width = width;
        this.height = height;
    }


    @Override
    public float getArea() {
        return this.width*this.height;
    }

    @Override
    public float getPerimeter() {
        return (this.height + this.width)*2;
    }

    @Override
    public void display() {
        System.out.print("Прямоугольник. \n");
        System.out.printf("x: %f, y: %f.\n",this.x,this.y);
        System.out.printf("Периметр: %f\n",this.getPerimeter());
        System.out.printf("Площадь: %f",this.getArea());
        System.out.println();

    }
}
