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
public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;
    
    public SwitchButton(){
        status=false;
    }
    public void connectToLamp(ElectricLamp electricLamp){
        lamp=electricLamp;
    }
    public void switchOff(){
        status=false;
        lamp.turnOff();
    }
    public void switchOn(){
        status=true;
        lamp.turnOn();
    }
    public boolean getStatus(){
        return status;
    }
}
