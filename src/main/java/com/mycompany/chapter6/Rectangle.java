/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter6;

/**
 *
 * @author 0788763
 */
public class Rectangle 
{

    private double length;
    private double width;
    private double area;
    
    public Rectangle()
    {
        length = 1;
        width = 1;
    }
    
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public static void printType()
    {
        System.out.println("I'm a rectangle");
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
