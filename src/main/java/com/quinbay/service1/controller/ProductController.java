package com.quinbay.service1.controller;




import com.quinbay.service1.model.Product;
import com.quinbay.service1.service.ProductOp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductOp product;

    @GetMapping("/getProduct")
    public ArrayList<Product> get_prod(){
        return product.disp_product();
    }

    @GetMapping("/getProduct/{id}")
    public Product get_prod_byId(@RequestParam int id){
        return product.get_product_byId(id);
    }

    @PostMapping("/addProduct")
    public Product add_prod(@RequestBody Product a)
    {
        return product.add_product(a);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<String> add_wareIn(@RequestParam int id, @RequestParam int val)
    {
        return product.update_Product(id, val);
    }
    //
    @DeleteMapping("/deleteProduct/{id}")
    public String det_prod(@RequestParam int id) {
        return product.remove_product(id);

    }

}
