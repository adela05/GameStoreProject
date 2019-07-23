package com.compay.GameStoreProject.Controllers;

import com.compay.GameStoreProject.Repositories.TShirts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.compay.GameStoreProject.Service.TshirtService;


import javax.validation.Valid;
import java.util.List;

@RestController
public class TshirtController {
    @Autowired

    private TshirtService service;

    @RequestMapping(value = "/tshirts", method = RequestMethod.GET)
    public List<TShirts> getAllTShirts(){
        return service.getAllTShirts();
    }
    @RequestMapping(value = "/tshirts/{id}", method = RequestMethod.DELETE)
    public Integer deleteTshirt(@PathVariable Integer tShirtId){
        return service.deleteTShirt(tShirtId);
    }
    @RequestMapping(value = "/tshirts/{id}", method = RequestMethod.PUT)
    public void updateTshirt(@RequestBody @Valid TShirts tshirt, @PathVariable Integer tShirtId){
        service.updateTshirt(tshirt);
    }
    @RequestMapping(value = "/tshirts", method = RequestMethod.POST)
    public TShirts addTshirt(@RequestBody @Valid TShirts tshirt){
        service.saveTShirt(tshirt);
        return tshirt;
    }
    @RequestMapping(value = "/tshirts/color/{color}", method = RequestMethod.GET)
    public List<TShirts> findByColor(@PathVariable String color){
        return service.findByColor(color);
    }
    @RequestMapping(value = "/tshirts/size/{size}", method = RequestMethod.GET)
    public List<TShirts> findBySize(@PathVariable String size){
        return service.findBySize(size);
    }
}
