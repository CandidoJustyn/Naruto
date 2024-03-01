/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambot;

import MultiLevel_Inheritance.Class_A;
import MultiLevel_Inheritance.Class_B;
import MultiLevel_Inheritance.Class_C;



public class Bus {
    public static void main (String[] args){
//        AcfBus acfbus = new AcfBus();
//        YellowBus yellowbus = new YellowBus();
//        
//        acfbus.Malita();
//        yellowbus.Davao();
//        yellowbus.Digos();
//        yellowbus.Padada();
//        yellowbus.Sulop();
        
Class_A classA = new Class_A();
Class_A classB = new Class_B();
Class_C classC = new Class_C();

classC.displayfromClass_C();
    }
}
