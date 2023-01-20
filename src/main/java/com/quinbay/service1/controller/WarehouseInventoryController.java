package com.quinbay.service1.controller;


import com.quinbay.service1.model.Warehouse;
import com.quinbay.service1.model.warehouse_inventory;
import com.quinbay.service1.service.WarehouseInventoryOp;
import com.quinbay.service1.service.WarehouseOp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = "/warehouseInventory")
public class WarehouseInventoryController{
    @Autowired
    WarehouseInventoryOp warehouseInventory;

    @GetMapping("/getWarehouseIn")
    public ArrayList<warehouse_inventory> get_ware(){
        return warehouseInventory.disp_warehouseIn();
    }

    @GetMapping("/getWarehouseId/{id}")
    public warehouse_inventory get_warehouseIn_byId(@RequestParam int id){
        return warehouseInventory.get_warehouseIn_byId(id);
    }

    @PostMapping("/addWarehouseIn")
    public warehouse_inventory add_wareIn(@RequestBody warehouse_inventory a)
    {
        return warehouseInventory.add_warehouseIn(a);
    }

    @PutMapping("/updateWarehouseIn")
    public ResponseEntity<String> add_wareIn(@RequestParam int id, @RequestParam int val)
    {
            return warehouseInventory.update_warehouseIn(id, val);
    }
//
    @DeleteMapping("/deleteWarehouseIn/{id}")
    public String det_wae(@RequestParam int id) {
        return warehouseInventory.remove_warehouseIn(id);

    }
}
