package com.quinbay.service1.service;

import com.quinbay.service1.Interface.warehouseInterface;
import com.quinbay.service1.Repository.ProductRepository;
import com.quinbay.service1.Repository.WarehouseRepository;
import com.quinbay.service1.model.Product;
import com.quinbay.service1.model.Warehouse;
import com.quinbay.service1.model.warehouse_inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class WarehouseOp implements warehouseInterface {
    @Autowired
    WarehouseRepository warerepo;

//    public static ArrayList<Product> product = new ArrayList<>();
    @Override
    public ArrayList<Warehouse> disp_warehouse() {
        return (ArrayList<Warehouse>) warerepo.findAll();
    }

    @Override
    public Warehouse add_warehouse(Warehouse add_ware) {
        return warerepo.save(add_ware);
    }
    public Warehouse get_warehouse_byId(int wareId){
        return warerepo.findById(wareId);

    }
    public ResponseEntity<String> update_warehouse(int id, String val){
        Warehouse warehouse= warerepo.findById(id);

//        warehouseInventory.setStock(quantity);
        warehouse.setName(val);
        warerepo.save(warehouse);
        return new ResponseEntity("Successfully update",HttpStatus.OK);
    }
@Override
    public String remove_warehouse(int id){
        try{
            warerepo.deleteById(id);
            return ("Deleted successfully");
        }catch(Exception e){
            return ("Not deleted");
        }

    }

}
