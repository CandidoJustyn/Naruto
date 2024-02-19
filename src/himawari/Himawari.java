/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package himawari;

/**
 *
 * @author Student
 */
//public class Himawari {

   class Parent{
       //gamit=attributes
       //tao=function
       
      public void something(){
          System.out.println("hi kim gahi najud ka?");
      }
   }
   
   class child extends Parent{
       public void something(){
           System.out.println("welcome to this world sumbagay ta gahi namn gud ka");
           
       }
   } 
   public class Himawari{
    public static void main(String[] args) {
//        //object class
//        Himawari prc = new Himawari();
//        //object class of Himawari
//        Himawari.Parent parentClass = prc.new Parent();
//        
//        parentClass.something();
//        
//        Himawari.child childClass = prc.new child();
//        childClass.something();
        

     Himawari prc = new Himawari();
     
     Parent parent = new Parent();
     parent.something();
        
    }
    
}
