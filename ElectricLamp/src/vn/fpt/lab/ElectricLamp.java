/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.lab;

/**
 *
 * @author hsang
 */
public class ElectricLamp {

   private boolean status;
   
   public ElectricLamp(){
       status=false;
   }
   public void turnOff(){
       status=false;
   }
   public void turnOn(){
       status=true;
   }
   public boolean getStatus(){
        return status;
    }
    
}
