package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "lp_details")
public class Laptop {

    @Id
    private int lp_id;
    private int lp_price;
    private String lp_name;

    @OneToOne
    private Student student;

    public Laptop() {

    }

    public Laptop(int lp_id, int lp_price, String lp_name, Student student) {
        this.lp_id = lp_id;
        this.lp_price = lp_price;
        this.lp_name = lp_name;
        this.student = student;
    }

    public int getLp_id() {
        return lp_id;
    }

    public void setLp_id(int lp_id) {
        this.lp_id = lp_id;
    }

    public int getLp_price() {
        return lp_price;
    }

    public void setLp_price(int lp_price) {
        this.lp_price = lp_price;
    }

    public String getLp_name() {
        return lp_name;
    }

    public void setLp_name(String lp_name) {
        this.lp_name = lp_name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lp_id=" + lp_id +
                ", lp_price=" + lp_price +
                ", lp_name='" + lp_name + '\'' +
                ", student=" + student +
                '}';
    }
}
