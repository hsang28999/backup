/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hsang
 */
public class StudentModel {
    ArrayList<Student> studentArray = new ArrayList<>();
    public void defaultStudent(){
        Student st = new Student("Tuan Minh",19,"T1707A");
        Student st1 = new Student("Ngo Tuan",19,"T1707A");
        Student st2 = new Student("Long Son",19,"T1707A");
        studentArray.add(st1);
        studentArray.add(st);
        studentArray.add(st2);
    }
    public int getHome(){
        System.out.println("=============");
        System.out.println("1. Nhap them sinh vien");
        System.out.println("2. Hien thi danh sach sinh vien");
        System.out.println("3. Thoat");
        System.out.println("=============");
        System.out.println("Nhap lua chon cua ban: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
    
    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        int studentNumber;
        while(true){
            System.out.println("=============");
            System.out.println("Ban muon them bao nhieu hoc sinh:");
            studentNumber = Integer.parseInt(sc.nextLine());
            if(studentNumber>0){
                break;
            }else{
                System.out.println("Nhap sai. Yeu cau nhap lai!");
            }
        }
        System.out.println("=============");
           for(int i=0;i<studentNumber;i++){ 
               System.out.println("Thong tin hoc sinh thu "+(i+1));
               System.out.println("Ten hoc sinh: ");
               String name = sc.nextLine();
               System.out.println("Lop: ");
               String room = sc.nextLine();
               System.out.println("Tuoi: ");
               int age = sc.nextInt();
               Student student = new Student(name,age,room);
               studentArray.add(student);
               System.out.println("=============");
           }
    }
    public void showList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=============");
        System.out.println("Danh sach hoc sinh");
        for(int i=0;i<studentArray.size();i++){
            System.out.println(i+1+". "+studentArray.get(i).getName()+" - "+studentArray.get(i).getAge()+" - "+studentArray.get(i).getRoom());
        }
        System.out.println("Nhap ky tu bat ky de thoat ra:");
        sc.nextLine();
    }
}
