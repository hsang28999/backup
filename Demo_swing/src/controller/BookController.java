/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Book;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author hsang
 */
public class BookController {
    ArrayList<Book> mod = new ArrayList<>();
    public BookController(){
        Book book1 = new Book("1","How to Win Friends and Influence People ","Dale Carnegie","Simon & Schuster");
        Book book2 = new Book("2","Think And Grow Rich ","Napoleon Hill","Kim Dong");
        Book book3 = new Book("3","The 7 Habits Of Highly Effective People ","Stephen Covey","Free Press");
        Book book4 = new Book("4","Rich Dad, Poor Dad ","Robert Kiyosak","Sharon L. Lechter");
        Book book5 = new Book("5","The 4 Hours Work Week","Timothy Ferriss","Timothy Ferriss");
        mod.add(book1);
        mod.add(book2);
        mod.add(book3);
        mod.add(book4);
        mod.add(book5);
    }
    private int bookNumber;

    public int getBookNumber() {
        return bookNumber;
    }
    
    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }
    
    public void addBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter ID:");
        String ID = sc.nextLine();
        System.out.println("Please enter name book:");
        String name = sc.nextLine();
        System.out.println("Please enter author book:");
        String author = sc.nextLine();
        System.out.println("Please enter publishing company book:");
        String publishingCompany = sc.nextLine();
        Book objt = new Book(ID,name,author,publishingCompany);
        mod.add(objt);
        System.out.println("Success!");
    }
    public int listBook(){
        System.out.println("----------");
        for(int i=0;i<mod.size();i++){
            System.out.println((i+1)+"."+mod.get(i).getName());
        }
        System.out.println("0.Return");
        System.out.println("Please enter number the book's you choose:");
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();
        bookNumber = pick-1;
        return pick;
    }
    public String getHome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------");
        System.out.println("1.List Book");
        System.out.println("2.Add Book");
        System.out.println("3.Search Book");
        System.out.println("--------------");
        System.out.println("Your choose:");
        String pick = sc.nextLine();
        return pick;
    }
    public String BookDetail(){
        System.out.println("----------");
        System.out.println("ID: "+mod.get(bookNumber).getID()); 
        System.out.println("Name: "+mod.get(bookNumber).getName());
        System.out.println("Author: "+mod.get(bookNumber).getAuthor());
        System.out.println("Publishing Company: "+mod.get(bookNumber).getPublishingCompany());
        System.out.println("----------------");
        System.out.println("1.Edit this book");
        System.out.println("2.Delete this book");
        System.out.println("3.Return");
        System.out.println("----------------");
        System.out.println("Your choose is:");
        Scanner sc = new Scanner(System.in);
        String choose = sc.nextLine();
        return choose;
    }
    public void getEdit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------");
        System.out.println("Old name: "+mod.get(bookNumber).getName());
        System.out.println("New name: ");
        String name = sc.nextLine();
        if("".equals(name)) name = mod.get(bookNumber).getName();
        System.out.println("Old author: "+mod.get(bookNumber).getAuthor());
        System.out.println("New author: ");
        String author = sc.nextLine();
        if("".equals(author)) author = mod.get(bookNumber).getAuthor();
        System.out.println("Old publishing company: "+mod.get(bookNumber).getPublishingCompany());
        System.out.println("New publishing company:");
        String publishingCompany = sc.nextLine();
        if("".equals(publishingCompany)) publishingCompany = mod.get(bookNumber).getPublishingCompany();
        String ID = mod.get(bookNumber).getID();
        Book objt = new Book(ID,name,author,publishingCompany);
        mod.set(bookNumber, objt);
        System.out.println("Success");
    }
    public void getDelete(){
        mod.remove(bookNumber);
        System.out.println("Success");
    }
    public void searchBook(){
        System.out.println("Please enter text search:");
        Scanner sc = new Scanner(System.in);
        CharSequence text = sc.nextLine().toLowerCase();
        for(int i=0;i<mod.size();i++){
            if(mod.get(i).getName().toLowerCase().contains(text) || mod.get(i).getAuthor().toLowerCase().contains(text) || mod.get(i).getPublishingCompany().toLowerCase().contains(text)){
                System.out.println((i+1)+"."+mod.get(i).getName());
            }
        }
        System.out.println("0.Return");
        System.out.println("Please enter number the book's you choose:");
        int choose = sc.nextInt();
        if(choose != 0){
            bookNumber = choose-1;
            BookDetail();
        }
    }
}
