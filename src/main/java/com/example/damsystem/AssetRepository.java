package com.example.damsystem;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Asset, Integer> = "manage Asset rows whose id is an Integer"
public interface AssetRepository extends JpaRepository<Asset, Integer> {
}
