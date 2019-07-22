package com.compay.GameStoreProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsoleRepository extends JpaRepository<Consoles, Integer> {
    List<Consoles> findByManufacturer(String manufacturer);
}
