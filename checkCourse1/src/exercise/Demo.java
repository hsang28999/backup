/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;


/**
 *
 * @author hsang
 */
public class Demo {
    public static void main(String[] args) {
        boolean demo = true;
        StudentModel model = new StudentModel();
        model.defaultStudent();
        while(demo){
            switch(model.getHome()){
                case 1:
                    model.addStudent();
                    break;
                case 2:
                    model.showList();
                    break;
                case 3:
                    demo=false;
                    break;
                default:
                    System.out.println("Nhap sai. Yeu cau nhap lai!");
                    break;
            }
        }
    }
}
