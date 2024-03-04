/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nana;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class HRManager  extends Employee{
    
    Scanner scn = new Scanner (System.in);
    
    public String working;
    public String organization;
    public String fname;
    public int age;
    public String position;
    
    public void work() {
        System.out.println("Work: ");
        working = scn.nextLine();
        System.out.println("organization: ");
        organization =scn.nextLine();
    }
     public void addEmployee () {
         System.out.println("\nHiring Employee!");
         System.out.println("Full Name: ");
         fname = scn.nextLine();
         
         System.out.println("Age: ");
         age = scn.nextInt();
         scn.nextLine();
         
         System.out.println("Position: ");
         position = scn.nextLine();
         
     }  
     public void Data() {
         System.out.println("\nInfo:\n" + "Full Name: " + fname + "\nAge: " + age + "\nPosition: " + position );
         
     }
            
            
    
}
