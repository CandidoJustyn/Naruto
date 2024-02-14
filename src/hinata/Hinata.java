/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinata;

import java.util.Arrays;

/**
 *
 * @author Student
 */
public class Hinata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {20,30,60,826,50};
        
        System.out.println("Elements of the array:");
        System.out.println("First array elements:" + array[0]);
        System.out.println("Second array elements:" + array[1]);
        System.out.println("Third array elements:" + array[2]);
        System.out.println("Fourth array elements:" + array[3]);
        System.out.println("Fifth array elements:" + array[4]);
        
        int sum = Arrays.stream(array).sum();
        
        System.out.println("Sum of the array elements: " + sum);
         
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Maximum value in the array:" + max); 
                
        
    }
    
}
