package com.quinbay.service1.Interface;

import com.quinbay.service1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface ProductInterface {
    ArrayList<Product> disp_product();
    Product add_product(Product product);
    Product get_product_byId(int id);
//    void update_producr(int id,int val);
    String remove_product(int id);
}
