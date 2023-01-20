package com.quinbay.service1.Repository;

import com.quinbay.service1.model.Product;
import com.quinbay.service1.model.warehouse_inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface WarehouseInventoryRepository extends JpaRepository<warehouse_inventory, Integer> {
    warehouse_inventory findById(int in);
}

