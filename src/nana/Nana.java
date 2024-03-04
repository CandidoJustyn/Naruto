/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nana;

/**
 *
 * @author Student
 */
public class Nana {
    public static void main(String[] args) {
        
        Employee employee = new Employee();
        HRManager hrmanager = new HRManager();
        
        hrmanager.work();
        hrmanager.addEmployee();
        employee.getSalary();
        hrmanager.Data();
        employee.sahod(); 
        
    }
    
}
