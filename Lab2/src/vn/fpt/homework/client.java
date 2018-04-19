/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.homework;

/**
 *
 * @author hsang
 */
public class client {
    public static void main(String[] args){
        Student studentA = new Student();
        Student studentB = new Student(1,"Hoang Sang",true);
        studentB.printInfo();
        studentA.setName("Hoang Long");
        studentB.getName();
    }
    
}
