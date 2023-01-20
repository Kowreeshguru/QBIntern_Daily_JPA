package com.quinbay.service1.Repository;

import com.quinbay.service1.model.Warehouse;
import com.quinbay.service1.model.warehouse_inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    Warehouse findById(int in);
}

