package com.quinbay.service1.service;

import com.quinbay.service1.Interface.WarehouseInventory;
import com.quinbay.service1.Repository.ProductRepository;
import com.quinbay.service1.Repository.WarehouseInventoryRepository;
import com.quinbay.service1.model.Product;
import com.quinbay.service1.model.warehouse_inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class WarehouseInventoryOp implements WarehouseInventory{
    @Autowired
    WarehouseInventoryRepository wareIn;


//    public static ArrayList<warehouse_inventory> warehouseIn = new ArrayList<>();
    @Override
    public ArrayList<warehouse_inventory> disp_warehouseIn() {
        return (ArrayList<warehouse_inventory>) wareIn.findAll();
    }

    public warehouse_inventory add_warehouseIn(warehouse_inventory add_wareIn) {
        return wareIn.save(add_wareIn);
    }
    public warehouse_inventory get_warehouseIn_byId(int wareInId){
        return wareIn.findById(wareInId);

    }
    public ResponseEntity<String> update_warehouseIn(int id, int val){
        warehouse_inventory warehouseInventory = wareIn.findById(id);

//        warehouseInventory.setStock(quantity);
        warehouseInventory.setPrice(val);
        wareIn.save(warehouseInventory);
        return new ResponseEntity("Successfully update",HttpStatus.OK);
    }

    public String remove_warehouseIn(int id){
        try{
            wareIn.deleteById(id);
            return ("Deleted successfully");
        }catch(Exception e){
            return ("Not deleted");
        }

    }
}
