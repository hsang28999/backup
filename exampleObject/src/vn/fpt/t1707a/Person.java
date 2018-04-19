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
public class Person {
    public static void main(String[] args){
        People person1 = new People();
        People person2 = new People();
        
        person1.name = "Hoang Sang";
        person1.age = 19;
        person1.gender = "Other";
        
        person2.name = "Hoang Thanh Dat";
        person2.age = 24;
        person2.gender = "Male";
        
        System.out.println("Person1: "+person1.name+" - "+person1.age +" - "+person1.gender);
        System.out.println("Person2: "+person2.name+" - "+person2.age +" - "+person2.gender);
        
        person1.talk("Hello "+person2.name);
        person2.talk("Hi "+person1.name);
        person1.happy();
        person2.cry();
    }
}
