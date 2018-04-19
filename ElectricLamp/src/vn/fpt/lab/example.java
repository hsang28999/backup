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
public class example {
    public static void main(String[] args){
        SwitchButton button1 = new SwitchButton();
        ElectricLamp lamp1 = new ElectricLamp();
        button1.connectToLamp(lamp1);
        button1.switchOn();
        System.out.println(button1.getStatus());
        System.out.println(lamp1.getStatus());
    }
}
