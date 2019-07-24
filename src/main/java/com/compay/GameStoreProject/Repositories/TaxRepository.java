package com.compay.GameStoreProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaxRepository extends JpaRepository<Tax, Character> {
    List<Tax> findByState(Character state);
    List<Tax> findByRate(Double taxRate);
}
