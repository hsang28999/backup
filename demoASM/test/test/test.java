/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author hsang
 */


/**
 * Stackoverflow 34014436 question.
 *
 */
public class test {
    public static void main(String[] args){
            ArrayList<String> array = new ArrayList<>();
            array.add("1");
            int i=2;
            while(array.size()<6){
                array.add("1");
                System.out.println(array.size());
                i++;
            }
    }
}
