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
public class Rectangle {

    int width;
    int height;
    
    public Rectangle(){
        this.width = 7;
        this.height = 3;
    }
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public void display(){
        for(int i=0;i<this.height;i++){
            for(int j=0;j<this.width;j++){
                System.out.printf("#");
            }
            System.out.println("");
        }
    }
    public int getArea(){
        int area = this.width * this.height;
        return area;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getPerimeter(){
        int perimeter = (this.width + this.height)*2;
        return perimeter;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
}
