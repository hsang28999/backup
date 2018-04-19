/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt;

import java.util.Scanner;

/**
 *
 * @author hsang
 */

public class appsession1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("Input your name: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        System.out.println(word);
        
        int[] arr;
        arr = new int[20];
        arr[0] = 18;
        System.out.println(arr[0]);
    }
            
}
