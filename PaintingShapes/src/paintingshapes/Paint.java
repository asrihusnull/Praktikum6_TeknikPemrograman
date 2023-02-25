/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintingshapes;

/**
 *
 * @author Asri Husnul Rosadi
 * 
 * Represents a type of paint that has a fixed area
 * covered by a gallon. All measurements are in feet.
 */
public class Paint {
    private double coverage;    //number of square feet per gallon
    
    //Constructor: Sets up the paint object.
    public Paint(double c){
        coverage = c;
    }
    
    //Returns the amount of paint (number of gallons)
    //needed to paint the shape given as the parameter.
    public double amount(Shape s){
        System.out.println ("Computing amount for " + s);
        double area = s.area();
        double gallonsNeeded = area / coverage;
        return gallonsNeeded;
    }
}
