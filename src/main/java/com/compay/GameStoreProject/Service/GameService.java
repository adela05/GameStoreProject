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
    public void updateGame(Games game, int id) {
        if(game.getGameId() == id) {
            gameRepo.save(game);
        }
    }

    // Search all Games List
    public List<Games> getAllGames(){
    return gameRepo.findAll();
}

    // Get a Game by Id
    public Games getGameById(int id){
        return gameRepo.getOne(id);
    }

    // Delete a Game
    public Integer deleteGame(int id){
        gameRepo.deleteById(id);
        return null;
    }

}
