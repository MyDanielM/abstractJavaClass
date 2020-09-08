package com.mydanielm;
//Абстрактный класс, реализующий функционал геометрической фигуры
public abstract class Figure {

    float x; //x-координата точки
    public float getX() {
        return x;
    }

    float y; //y-координата точки
    public float getY() {
        return y;
    }

    Figure(float x, float y){
        this.x = x;
        this.y = y;
    }

    public abstract float getArea();
    public abstract float getPerimeter();

    public abstract void display();
}
