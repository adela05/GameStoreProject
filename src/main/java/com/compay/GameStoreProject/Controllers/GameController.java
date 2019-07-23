package com.compay.GameStoreProject.Controllers;

import com.compay.GameStoreProject.Repositories.Games;

import com.compay.GameStoreProject.Service.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GameController {
    @Autowired

    private GameService service;

    @RequestMapping(value = "/games", method = RequestMethod.GET)
    public List<Games> getAllGames(){
        return service.getAllGames();
    }
    @RequestMapping(value = "/games/{id}", method = RequestMethod.DELETE)
    public Integer deleteGame(@PathVariable Integer id){
        return service.deleteGame(id);
    }
    @RequestMapping(value = "/games/{id}", method = RequestMethod.PUT)
    public void updateGame(@RequestBody @Valid Games game, @PathVariable Integer id){
        service.updateGame(game, id);
    }
    @RequestMapping(value = "/games", method = RequestMethod.POST)
    public Games saveGame(@RequestBody @Valid Games game){
        service.saveGame(game);
        return game;
    }
    @RequestMapping(value = "/games/studio/{studio}", method = RequestMethod.GET)
    public List<Games> findByStudio(@PathVariable String studio){
        return service.findByStudio(studio);
    }
    @RequestMapping(value = "/games/rating/{rating}", method = RequestMethod.GET)
    public List<Games> findByESRBRating(@PathVariable Character eSRBRating){
        return service.findByESRBRating(eSRBRating);
    }
    @RequestMapping(value = "/games/title/{title}", method = RequestMethod.GET)
    public List<Games> findByTitle(@PathVariable String title){
        return service.findByTitle(title);

    }
}
