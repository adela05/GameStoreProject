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

    @RequestMapping(value = "/consoles/{id}", method = RequestMethod.DELETE)
    public Consoles deleteConsolebyId(@PathVariable Integer consoleId){
        return service.getConsoleById(consoleId);
    }
    @RequestMapping(value = "/consoles/{id}", method = RequestMethod.PUT)
    public void updateConsoleById(@RequestBody @Valid Consoles console, @PathVariable Integer consoleId){
        service.updateConsoleById(console);
    }
    @RequestMapping(value = "/consoles", method = RequestMethod.POST)
    public Consoles saveConsole(@RequestBody @Valid Consoles console){
        service.saveConsole(console);
        return console;
    }
    @RequestMapping(value = "/consoles/manufacturer/{manufacturer}", method = RequestMethod.GET)
    public List<Consoles> getConsolesByManufacturer(@PathVariable String manufacturer){
        return service.getConsolesByManufacturer(manufacturer);
    }
}
