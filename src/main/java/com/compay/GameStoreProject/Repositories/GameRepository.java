package com.compay.GameStoreProject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Games, Integer> {
    List<Games> findByStudio(String studio);
    List<Games> findByESRBRating(Character eSRBRating);
    List<Games> findByTitle(String title);
}
