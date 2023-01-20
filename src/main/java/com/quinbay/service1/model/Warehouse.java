package com.quinbay.service1.model;

import javax.persistence.*;

@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name="ware_id")
    int ware_id;
    @Column(name="name")
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWare_id() {
        return ware_id;
    }

    public String getName() {
        return name;
    }

    public void setWare_id(int ware_id) {
        this.ware_id = ware_id;
    }

    public void setName(String name) {
        this.name = name;
    }
    Warehouse(){};

    Warehouse(int id,int w_id,String name){
        this.id=id;
        this.ware_id=w_id;
        this.name=name;
    }
}
