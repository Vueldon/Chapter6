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
public class Main 
{
    public static void main(String[] args) 
    {
        Rectangle myRectangle = new Rectangle();
        myRectangle.setWidth(5);
        myRectangle.setLength(10);
        
        Rectangle myRectangle2 = new Rectangle(15,20);
        
        Rectangle.printType();
    }
}
