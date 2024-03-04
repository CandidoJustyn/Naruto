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
public class Employee {
    
    Scanner scn = new Scanner(System.in);
    
    public int workingdays;
    public int mysalary;
    
    public void work(){
        
    }
    public void getSalary (){
        System.out.println("Working Days: ");
        workingdays = scn.nextInt();
        mysalary = workingdays * 600;
    }
    public void sahod (){
        System.out.println("Salary: " + mysalary + "$");
    }
}
