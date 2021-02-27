package com.sai.SBCore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.SBCore.entity.Fare;

public interface FareDAO extends JpaRepository<Fare, Integer> {

}
