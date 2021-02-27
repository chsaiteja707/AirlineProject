package com.sai.SBCore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.SBCore.entity.Inventory;

public interface InventoryDAO extends JpaRepository<Inventory, Integer> {

}
