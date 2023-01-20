package com.quinbay.service1.model;


import javax.persistence.*;


@Entity
@Table(name="warehouse_inventory")
public class warehouse_inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(name = "ware_id")
    int ware_id;
    @Column(name = "p_id")
    int p_id;
    @Column(name = "stock")
    int stock;
    @Column(name = "price")
    int price;

    public void setWare_id(int ware_id) {
        this.ware_id = ware_id;
    }

    public int getWare_id() {
        return ware_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getP_id() {
        return p_id;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
