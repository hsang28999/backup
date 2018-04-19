/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.t1707a;

/**
 *
 * @author hsang
 */
public class GlassesObject {
    public static void main(String[] args){
        Glasses Oakley = new Glasses();
        Glasses Rayban = new Glasses();
        Oakley.name = "OAKLEY TAILPIN OO4086-4086/01(61CN)";
        Oakley.price = 300;
        Oakley.brand = "Oakley";
        Rayban.name = "RAY-BAN RB3429M-002/40(58IT)";
        Rayban.price = 250;
        Rayban.brand = "Ray-Ban";
        
        System.out.println(Oakley.name+" - "+Oakley.price+"$ - "+Oakley.brand);
        System.out.println(Rayban.name+" - "+Rayban.price+"$ - "+Rayban.brand);
    }
}
