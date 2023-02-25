/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeepolymorphism;

/**
 *
 * @author Asri Husnul Rosadi
 * 
 * Demonstrates polymorphism via inheritance 
 */
public class Firm {

    /**
     * @param args the command line arguments
     * 
     * Creates a staff of employees for a firm and pays them.
     */
    public static void main(String[] args) {
        Staff personnel = new Staff();
        
        personnel.payday();
    }
    
}
