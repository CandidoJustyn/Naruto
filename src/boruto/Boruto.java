/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boruto;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Boruto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter Last Name:");
        String Name = scn.nextLine();
        
        System.out.println("Enter First Name:");
        String fName = scn.nextLine();
        
        System.out.println("Enter Middle Name");
        String mName = scn.nextLine();
        
        System.out.println("Enter Age");
        int age = scn.nextInt();
        
        scn.nextLine();
        
        System.out.println("Enter Gender:");
        String gName = scn.nextLine();
        
        System.out.println("Enter Birthdate");
        String bNanme = scn.nextLine();
        
        System.out.println(" ");
        System.out.println("YOUR DATA:" );
        
        System.out.println("Last Name: " + Name);
        System.out.println("First Name: " + fName);
        System.out.println("Middle Name: " + mName);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gName);
        System.out.println("Birthdate:" + Name);
        
        scn.close();
        
    }
    
}
