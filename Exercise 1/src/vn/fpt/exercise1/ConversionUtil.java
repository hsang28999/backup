/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.exercise1;

/**
 *
 * @author hsang
 */
public class ConversionUtil {
    public double fahrenheitToCelsius(double fDegree){
        double cDegree = ((fDegree-32)*5)/9;
        return cDegree;
    }
    
    public double celciusToFahrenheit(double cDegree){
        double fDegree = (cDegree*9)/5+32;
        return fDegree;
    }
    
    public static void main(String[] args) {
        ConversionUtil cvu = new ConversionUtil();
        System.out.println("70.574 fahrenheit equal "+cvu.fahrenheitToCelsius(70.574)+" celsius");
        System.out.println("21.43 celsius equal "+cvu.celciusToFahrenheit(21.43)+" fahrenheit");
    }
    
}
