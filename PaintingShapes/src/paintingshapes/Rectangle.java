/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintingshapes;

/**
 *
 * @author Asri Husnul Rosadi
 */
public class Rectangle extends Shape{
    private double length;
    private double width;
    
    //Constructor: Sets up the sphere.
    public Rectangle(double l, double w){
        super("Rectangle");
        length = l;
        width = w;
    }
    
    //Returns the surface area of the sphere.
    @Override
    public double area(){
        return length * width;
    }
    
    //Returns the sphere as a String.
    @Override
    public String toString(){
        return super.toString() + " of length " + length + " and of width " + width;
    }
}
