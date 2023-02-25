/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphicsorting;

import java.util.Scanner;
/**
 *
 * @author Asri Husnul Rosadi
 */
public class Strings {
     public static void main(String[] args) {
        String[] strList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nHow many string do you want to sort? ");
        size = scan.nextInt();
        strList = new String[size];
        
        System.out.println("\nEnter the string...");
        for(int i=0; i<size; i++){
            strList[i] = scan.next();
        }
        
        Sorting.insertionSort(strList);
         
        System.out.println("\nYour string in sorted order...");
        for (int i=0; i<size; i++){
            System.out.print(strList[i] + " ");
        }
        System.out.println();
         
        scan.close();
    }
}
