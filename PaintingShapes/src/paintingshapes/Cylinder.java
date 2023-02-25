/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintingshapes;

/**
 *
 * @author Asri Husnul Rosadi
 */
public class Cylinder extends Shape{
    private double radius;
    private double height;
    
    //Constructor: Sets up the sphere.
    public Cylinder(double r, double h){
        super("Cylinder");
        radius = r;
        height = h;
    }
    
    //Returns the surface area of the sphere.
    @Override
    public double area(){
        return Math.PI*radius*radius*height;
    }
    
    //Returns the sphere as a String.
    @Override
    public String toString(){
        return super.toString() + " of radius " + radius + " and of height " + height;
    }
}
