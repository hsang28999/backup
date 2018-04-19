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
public class Student {
    private String name;
    private int age;
    private String room ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Student(String name, int age, String room) {
        this.name = name;
        this.age = age;
        this.room = room;
    }

    public Student() {
    }
    
    
}
