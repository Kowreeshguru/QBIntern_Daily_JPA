package com.quinbay.service1.service;

import com.quinbay.service1.Interface.ProductInterface;
import com.quinbay.service1.Repository.ProductRepository;
import com.quinbay.service1.model.Product;
import com.quinbay.service1.model.warehouse_inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductOp implements ProductInterface {

    @Autowired
    ProductRepository proRepo;

    public static ArrayList<Product> product = new ArrayList<>();
    @Override
    public ArrayList<Product> disp_product() {
        return (ArrayList<Product>) proRepo.findAll();
    }

    public Product add_product(Product add_prod) {
        return proRepo.save(add_prod);
    }
    public Product get_product_byId(int productId){
        return proRepo.findById(productId);

    }
    public ResponseEntity<String> update_Product(int id, int val){
        Product product = proRepo.findById(id);

        product.setPrice(val);
        proRepo.save(product);
        return new ResponseEntity("Successfully update",HttpStatus.OK);
    }

    public String remove_product(int id){
        try{
            proRepo.deleteById(id);
            return ("Deleted successfully");
        }catch(Exception e){
            return ("Not deleted");
        }

    }
}
