package com.mydanielm;

public class Main {

    public static void main(String[] args) {
	Figure rectangle = new Rectangle(0,0,4,2);
	rectangle.display();
	Figure triangle = new Triangle(5,5,3,4,5);
	triangle.display();
    }
}
