/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paintingshapes;

/**
 *
 * @author Asri Husnul Rosadi
 */
abstract class Shape {
    String shapeName;
    
    public Shape (String shapeName) {
        this.shapeName = shapeName;
    }
    
    public abstract double area();
    
    @Override
    public String toString() {
        return "A shape with [shape of " + shapeName + "]";
    }
    
}
