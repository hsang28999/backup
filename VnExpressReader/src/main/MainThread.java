/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.DantriReader;
import controller.Reader;
import controller.VnExpressReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author hsang
 */
public class MainThread {
    public static void main(String[] args) throws IOException {
        generateMenu();
    }
    
    public static void generateMenu() throws IOException{
        Scanner sc = new Scanner(System.in);
        boolean pickNews = true;
        Reader reader = null;
        while(pickNews){
            System.out.println("=========News Website========");
            System.out.println("1.Vnexpress.net");
            System.out.println("2.Dantri.com");
            System.out.println("Please enter news website your choice:");
            int choiceWebsite=sc.nextInt();
            if(choiceWebsite==1){
                reader=new VnExpressReader();
                pickNews = false;
            }else if(choiceWebsite==2){
                reader=new DantriReader();
                pickNews = false;
            }else{
                System.out.println("Wrong choose. Please try again!");
            }
        }
        while(true){
            System.out.println("=========News Reader=========");
            System.out.println("1.Get index articles.");
            System.out.println("2.Get list category.");
            System.out.println("3.Return choose news website.");
            System.out.println("4.Exit.");
            System.out.println("=============================");
            //Yeu cau nguoi dung nhap lua chon
            System.out.println("Please enter your choice:");
            //Gan gia tri lua chon cua nguoi dung vao bien choice voi kieu
            //du lieu la int
            int choice = sc.nextInt();
            //Dua vao lua chon cua nguoi dung thuc hien thao tac tiep theo
            switch(choice){
                case 1:
                    reader.getIndexArticles();
                    break;
                case 2:
                    reader.getListCategories();
                    break;
                case 3:
                    generateMenu();
                    break;
                case 4:
                    System.out.println("Close program.See you again!");
                    break;
                default:
                    System.out.println("Wrong choice, please enter again:");
                    break;
            }
            if(choice==4){
                break;
            }
        }
    }
}
