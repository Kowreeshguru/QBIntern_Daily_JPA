package com.quinbay.service1.model;


import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

@Entity
//@Table
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name="p_id")
    public int p_id;
    @Column(name="name")
    public String name;
    @Column(name="price")
    public int price;
    @Column(name="gst")
    public int gst;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getP_id() {
        return p_id;
    }

    public int getGst() {
        return gst;
    }

    public void setGst(int gst) {
        this.gst = gst;
    }

    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product(int id, String name, int stock, int price, int gst){
        this.id=id;
        this.name=name;
        this.price=price;
        this.gst=gst;
    }
}
