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
public class test {
    public static void main(String[] args){
        FlashLamp lamp1 = new FlashLamp();
        FlashLamp lamp2 = new FlashLamp();
        Battery battery1 = new Battery();
        Battery battery2 = new Battery();
        battery2.setEnergy(200);
        battery1.setEnergy(300);
        lamp2.setBattery(battery2);
        lamp1.setBattery(battery1);
        lamp1.turnOff();
        System.out.println(lamp1.getBattery());
    }
}
