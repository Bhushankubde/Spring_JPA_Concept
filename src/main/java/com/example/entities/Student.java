package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "st_details")
public class Student {

    @Id
    private int id;
    private String name;
    private String city;

   /* @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)*/
    /*private Laptop laptop;*/

    public Student() {

    }

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   /* public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
*/
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
