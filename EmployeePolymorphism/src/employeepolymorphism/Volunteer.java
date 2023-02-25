/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeepolymorphism;

/**
 *
 * @author Asri Husnul Rosadi
 * 
 * Represents a staff member that works as a volunteer.
 */
public class Volunteer extends StaffMember{
    // Sets up a volunteer using the specified information
    public Volunteer (String eName, String eAddress, String ePhone) {
        super (eName, eAddress, ePhone);
    }
    
    // Returns a zero pay value for this volunteer
    @Override
    public double pay() {
        return 0.0;
    }
}
