/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.ex2;
import java.util.StringTokenizer;
import java.util.Scanner;

/**
 *
 * @author hsang
 */
public class Exercise2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+Enter a string:");
        String input = sc.nextLine();
        StringTokenizer stn = new StringTokenizer(input);
        System.out.println("+Result:");
        while (stn.hasMoreTokens()) {  
         System.out.println(stn.nextToken());  
     }  
    }
    
}
