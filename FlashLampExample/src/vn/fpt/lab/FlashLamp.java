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
public class FlashLamp {

    boolean status;
    Battery battery;
    public FlashLamp(){
        status=false;
    }
    public void setBattery(Battery battery3){
        battery = battery3;
    }
    public int getBattery(){
        return battery.getEnergy();
    }
    public void light(){
        if(status==true && battery!=null && battery.getEnergy()>0)
            battery.decreaseEnergy();
    }
    public void turnOn(){
        if(battery!=null && battery.getEnergy()>0){
            status = true;
        }
        light();
    }
    public void turnOff(){
        status=false;
    }
    
}
