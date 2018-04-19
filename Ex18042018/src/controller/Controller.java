/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.NhaXuatBan;
import entity.Sach;
import entity.TacGia;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hsang
 */
public class Controller {
    List<TacGia> authorArray = new ArrayList<>();
    List<NhaXuatBan> nxbArray = new ArrayList<>();
    List<Sach> bookArray = new ArrayList<>();
    public int home(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("1. Them tac gia");
        System.out.println("2. Them nha xuat ban");
        System.out.println("3. Them sach");
        System.out.println("4. Hien thi thong tin tac gia");
        System.out.println("5. Hien thi thong tin nha xuat ban");
        System.out.println("6. Hien thi thong tin sach");
        System.out.println("7. Tim kiem");
        System.out.println("8. Luu du lieu");
        System.out.println("9. Doc thong tin tu file");
        System.out.println("10. Thoat");
        int pick = sc.nextInt();
        return pick;
    }
    
    public void addAuthor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tac gia ma ban muon them:");
        int numberAuthor = Integer.parseInt(sc.nextLine());
        for(int i=0;i<numberAuthor;i++){
            System.out.println("Nhap ten tac gia:");
            String name = sc.nextLine();
            System.out.println("Nhap tuoi tac gia:");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap gioi tinh:");
            String gender = sc.nextLine();
            System.out.println("Nhap but danh:");
            String butdanh = sc.nextLine();
            System.out.println("Nhap dia chi:");
            String address = sc.nextLine();
            TacGia author = new TacGia(name,age,gender,butdanh,address);
            authorArray.add(author);
            System.out.println("==============");
        }
    }
    
    public void addNxb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nha xuat ban ma ban muon them:");
        int numberAuthor = Integer.parseInt(sc.nextLine());
        for(int i=0;i<numberAuthor;i++){
            System.out.println("Nhap ten nha xuat ban:");
            String name = sc.nextLine();
            System.out.println("Nhap dia chi nha xuat ban:");
            String address = sc.nextLine();
            NhaXuatBan nxb = new NhaXuatBan(name,address);
            nxbArray.add(nxb);
            System.out.println("==============");
        }
    }
    
    public void addBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tac gia ma ban muon them:");
        int numberAuthor = Integer.parseInt(sc.nextLine());
        for(int i=0;i<numberAuthor;i++){
            System.out.println("Nhap tieu de sach:");
            String name = sc.nextLine();
            System.out.println("Nhap loai sach:");
            String category = sc.nextLine();
            System.out.println("Nhap tac gia sach:");
            String author = sc.nextLine();
            System.out.println("Nhap nam san xuat:");
            int year = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap nha xuat ban:");
            String nsx = sc.nextLine();
            Sach book = new Sach(name,category,author,year,nsx);
            bookArray.add(book);
            System.out.println("==============");
        }
    }
    
    public void showAuthor(){
        for(int i=0;i<authorArray.size();i++){
            System.out.println("==============");
            System.out.println((i+1)+".");
            System.out.println("Ten: "+authorArray.get(i).getTen());
            System.out.println("Tuoi: "+authorArray.get(i).getTuoi());
            System.out.println("Gioi tinh: "+authorArray.get(i).getGioiTinh());
            System.out.println("But danh: "+authorArray.get(i).getButDanh());
            System.out.println("Dia chi: "+authorArray.get(i).getDiaChi());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("An phim bat ky de thoat");
        sc.nextLine();
    }
    
    public void showNxb(){
        for(int i=0;i<nxbArray.size();i++){
            System.out.println("==============");
            System.out.println((i+1)+".");
            System.out.println("Ten: "+nxbArray.get(i).getTen());
            System.out.println("Dia chi: "+nxbArray.get(i).getDiaChi());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("An phim bat ky de thoat");
        sc.nextLine();
    }
    
    public void showBook(){
        for(int i=0;i<bookArray.size();i++){
            System.out.println("==============");
            System.out.println((i+1)+".");
            System.out.println("Tieu de: "+bookArray.get(i).getTieuDe());
            System.out.println("Loai sach: "+bookArray.get(i).getLoaiSach());
            System.out.println("Tac gia: "+bookArray.get(i).getTacGia());
            System.out.println("Nam san xuat: "+bookArray.get(i).getNamSanXuat());
            System.out.println("Nha xuat ban: "+bookArray.get(i).getNxb());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("An phim bat ky de thoat");
        sc.nextLine();
    }
    
    public void search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("Tim kiem: ");
        String text = sc.nextLine();
        text = text.toLowerCase();
        int j=1;
        for(int i=0;i<bookArray.size();i++){
            if(bookArray.get(i).getTieuDe().toLowerCase().contains(text) || bookArray.get(i).getNxb().toLowerCase().contains(text) || bookArray.get(i).getTacGia().toLowerCase().contains(text)){
                System.out.println(j+"."+bookArray.get(i).getTieuDe());
                j++;
            }
        }
    }
    
    public void saveFile(){
        writeFile(bookArray,"book.dat");
        writeFile(authorArray,"author.dat");
        writeFile(nxbArray,"nxb.dat");   
    }
    
    public void openFile(){
        readFile("book.dat");
        readFile("author.dat");
        readFile("nxb.dat");
        
    }
    
    public void writeFile(List list,String fileName){
        try {
            File file = new File("C:/Users/hsang/Desktop/dataBook/"+fileName);
            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream outObj = new ObjectOutputStream(out);
            outObj.writeObject(list);
            outObj.close();
            out.close();
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
    public void readFile(String fileName){
        try {
            File file = new File("C:/Users/hsang/Desktop/dataBook/"+fileName);
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream inObj = new ObjectInputStream(in);
            if(null != fileName)switch (fileName) {
                case "book.dat":{
                    ArrayList<Sach> list = (ArrayList) inObj.readObject();
                    bookArray=list;
                        break;
                    }
                case "nxb.dat":{
                    ArrayList<NhaXuatBan> list = (ArrayList) inObj.readObject();
                    nxbArray=list;
                        break;
                    }
                case "author.dat":{
                    ArrayList<TacGia> list = (ArrayList) inObj.readObject();
                    authorArray=list;
                        break;
                    }
                default:
                    break;
            }
            inObj.close();
            in.close();
            System.out.println(nxbArray.get(0).getTen());
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}
