package com.compay.GameStoreProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProcessingFeeRepository extends JpaRepository<ProcessingFee, Double> {
    List<ProcessingFee> findByFee(Double fee);
}
