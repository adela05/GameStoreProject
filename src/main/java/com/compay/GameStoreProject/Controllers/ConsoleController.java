package com.compay.GameStoreProject.Controllers;

import com.compay.GameStoreProject.Repositories.Consoles;
import com.compay.GameStoreProject.Service.ConsolesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ConsoleController {
    @Autowired

    private ConsolesService service;

    @RequestMapping(value = "/consoles", method = RequestMethod.GET)
    public List<Consoles> getAllConsoles(){
        return service.getAllConsoles();
    }
    @RequestMapping(value = "/consoles/{manufacturer}", method = RequestMethod.GET)
    public String getConsolesByManufacturer(@PathVariable String manufacturer){
        return service.findByManufacturer(manufacturer);
    }
    @RequestMapping(value = "/consoles/{id}", method = RequestMethod.DELETE)
    public Consoles deleteConsolebyId(@PathVariable int consoleId){
        return service.getConsoleById(consoleId);
    }
    @RequestMapping(value = "/consoles/{id}", method = RequestMethod.PUT)
    public void updateConsole(@RequestBody @Valid Consoles console, @PathVariable int consoleId){
        service.saveConsole(console);
    }
    @RequestMapping(value = "/consoles", method = RequestMethod.POST)
    public Consoles saveConsole(@RequestBody @Valid Consoles console){
        service.saveConsole(console);
        return console;
    }
}
