package com.quinbay.service1.Interface;

import com.quinbay.service1.model.Product;
import com.quinbay.service1.model.Warehouse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface warehouseInterface {
    ArrayList<Warehouse> disp_warehouse();
    Warehouse add_warehouse(Warehouse warehouse);
    Warehouse get_warehouse_byId(int id);
    String remove_warehouse(int id);
}
