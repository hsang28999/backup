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
public class People {

    int age;
    String name;
    String address;
    String gender;
    String nickName;
    
    void talk(String msg){
        System.out.println(name + " : " + msg);
    }
    
    void happy(){
        System.out.println(name + " happy :)");
    }
    
    void cry(){
        System.out.println(name + " crying :((");
    }
    
}
