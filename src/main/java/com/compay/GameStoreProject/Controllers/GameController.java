package com.compay.GameStoreProject.Controllers;

import com.compay.GameStoreProject.Repositories.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GameController {
    @Autowired
    private Games gameRepo;

    @RequestMapping(value = "/games", method = RequestMethod.GET)
    public List<Games> getAllGames(){
        return gameRepo.findAll();
    }
    @RequestMapping(value = "/games/{id}", method = RequestMethod.DELETE)
    public Integer deleteGame(@PathVariable int gameId){
        return gameRepo.getGameId(gameId);
    }
    @RequestMapping(value = "/games/{id}", method = RequestMethod.PUT)
    public void updateTshirt(@RequestBody @Valid Games game, @PathVariable int gameId){
        gameRepo.save(game);
    }
    @RequestMapping(value = "/games", method = RequestMethod.POST)
    public Games addGame(@RequestBody @Valid Games game){
        gameRepo.save(game);
        return game;
    }
    @RequestMapping(value = "/games/{studio}", method = RequestMethod.GET)
    public String findByStudio(@PathVariable String studio){
        return gameRepo.getStudio(studio);
    }
    @RequestMapping(value = "/games/{rating}", method = RequestMethod.GET)
    public String findByESRBRating(@PathVariable Character eSRBRating){
        return gameRepo.getESRBRating(eSRBRating);
    }
    @RequestMapping(value = "/games/{title}", method = RequestMethod.GET)
    public String findByTitle(@PathVariable String title){
        return gameRepo.getTitle(title);
    }
}
