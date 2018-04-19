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
public class Animal {
    public static void main(String[] args){
        Animals cat = new Animals();
        Animals dog = new Animals();
        
        cat.name = "Cat";
        dog.name = "Dog";
        cat.eat("bone");
        dog.eat("fish");
        cat.bark();
        dog.meow();
    }
}
