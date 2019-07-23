package com.compay.GameStoreProject.Controllers;

import com.compay.GameStoreProject.Repositories.TShirts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TshirtController {
    @Autowired
    private TShirts tshirtRepo;

    @RequestMapping(value = "/tshirts", method = RequestMethod.GET)
    public List<TShirts> getAllTshirts(){
        return tshirtRepo.findAll();
    }
    @RequestMapping(value = "/tshirts/{id}", method = RequestMethod.DELETE)
    public Integer deleteTshirt(@PathVariable int tShirtId){
        return tshirtRepo.getTShirtId(tShirtId);
    }
    @RequestMapping(value = "/tshirts/{id}", method = RequestMethod.PUT)
    public void updateTshirt(@RequestBody @Valid TShirts tshirt, @PathVariable int tShirtId){
        tshirtRepo.save(tshirt);
    }
    @RequestMapping(value = "/tshirts", method = RequestMethod.POST)
    public TShirts addTshirt(@RequestBody @Valid TShirts tshirt){
        tshirtRepo.save(tshirt);
        return tshirt;
    }
    @RequestMapping(value = "/tshirts/{color}", method = RequestMethod.GET)
    public String findByColor(@PathVariable String color){
        return tshirtRepo.getColor(color);
    }
    @RequestMapping(value = "/tshirtss/{size}", method = RequestMethod.GET)
    public String findBySize(@PathVariable String size){
        return tshirtRepo.getSize(size);
    }
}
