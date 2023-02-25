/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paintingshapes;

import java.text.DecimalFormat;
/**
 *
 * @author ASUS
 * 
 * Computes the amount of paint needed to paint various
 * things. Uses the amount method of the paint class which
 * takes any Shape as a parameter.
 */
public class PaintThings {

    /**
     * @param args the command line arguments
     * 
     * Creates some shapes and a Paint object
     * and prints the amount of paint needed to paint each shape.
     */
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
        //Instansiate the threee shapes to paint
        Rectangle deck = new Rectangle(35,20);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10,30);
  
        //Compute the amount of paint needed for each shape
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);
        
        //Print the amount of paint for each.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
    
}
