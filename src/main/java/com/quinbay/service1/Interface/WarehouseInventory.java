package com.quinbay.service1.Interface;

import com.quinbay.service1.model.Warehouse;
import com.quinbay.service1.model.warehouse_inventory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;


@Repository
public interface WarehouseInventory {
    ArrayList<warehouse_inventory> disp_warehouseIn();
    warehouse_inventory add_warehouseIn(warehouse_inventory warehouseIn);
    warehouse_inventory get_warehouseIn_byId(int id);
    String remove_warehouseIn(int id);
}
