package com.quinbay.service1.Repository;

import com.quinbay.service1.model.Product;
import com.quinbay.service1.model.warehouse_inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
//    void updatePrice(int id,int price);
    Product findById(int in);
}
