/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hsang
 */
public class Hotel {
    private String name;
    private String location;
    private String ownerName;
    
    public Hotel(){
        name="Hotel California";
        location="15 Newyork";
        ownerName="Donal Trump";
    }
    
    public Hotel(String name,String location,String ownerName){
        this.name=name;
        this.location=location;
        this.ownerName=ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

        
    public static void main(String[] args) {
            Hotel hotel1=new Hotel();
        Hotel hotel2=new Hotel("The Ky Moi","20 Baker","Long");
        Hotel hotel3=new Hotel("Hong Lam","21 Baker","Son");
        Hotel hotel4=new Hotel("Minh Ngoc","22 Baker","Minh");
        Hotel hotel5=new Hotel("Mexico","23 Baker","Tuan");
        Hotel hotel6=new Hotel("Flash","24 Baker","Tu");
        Hotel hotel7=new Hotel("One minute","25 Baker","Hanh");
        Hotel hotel8=new Hotel("One hour","26 Baker","Trong");
        Hotel hotel9=new Hotel("Fast and furious","27 Baker","Hung");
        Hotel hotel10=new Hotel("Hello","28 Baker","Hieu");
        ArrayList<Hotel> hotels = new ArrayList<Hotel>();
            hotels.add(hotel1);
            hotels.add(hotel2);
            hotels.add(hotel3);
            hotels.add(hotel4);
            hotels.add(hotel5);
            hotels.add(hotel6);
            hotels.add(hotel7);
            hotels.add(hotel8);
            hotels.add(hotel9);
            hotels.add(hotel10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Owner's Name you want:");
        String result = sc.nextLine();
        for(int i=0;i<hotels.size();i++){
            if(result.equals(hotels.get(i).getOwnerName())){
                System.out.println("Name hotel: "+hotels.get(i).getName());
                System.out.println("Location: "+hotels.get(i).getLocation());
                System.out.println("Owner name: "+hotels.get(i).getOwnerName());
            }
        }
    }
    
}
