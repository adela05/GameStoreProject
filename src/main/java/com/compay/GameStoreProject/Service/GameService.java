package com.compay.GameStoreProject.Service;

import com.compay.GameStoreProject.Repositories.GameRepository;
import com.compay.GameStoreProject.Repositories.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameService {
@Autowired
    private GameRepository gameRepo;


    // Save a Game
    public Games saveGame(Games game){
        gameRepo.save(game);
        return game;
    }
    // Update a Game
    public void updateGame(Games game, Integer id) {
        if(game.getGameId() == id) {
            gameRepo.save(game);
        }
    }

    // Search all Games List
    public List<Games> getAllGames(){
    return gameRepo.findAll();
}

    // Delete a Game
    public Integer deleteGame(Integer id){
        gameRepo.deleteById(id);
        return null;
    }
    // List by Studio
    public List<Games> findByStudio(String studio){
        return gameRepo.findAll();
    }
    // List by ESRB Rating
    public List<Games> findByRating(String rating){
        return gameRepo.findAll();
    }
    // List by Title
    public List<Games> findByTitle(String title){
        return gameRepo.findAll();
    }
}
