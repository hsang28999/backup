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
public class Animals {
    String name;
    String color;
    
    void eat(String food){
        System.out.println(name+" eat "+food);
    }
    void meow(){
        System.out.println(name+" meow meow :3");
    }
    void bark(){
        System.out.println(name+" barking =.=");
    }
}
