package com.compay.GameStoreProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TShirtRepository extends JpaRepository<TShirts, Integer> {
    List<TShirts> findByColor(String color);
    List<TShirts> findBySize(Character size);
}
