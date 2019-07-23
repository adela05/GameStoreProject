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
        return service.findAll();
    }
    @RequestMapping(value = "/consoles/{manufacturer}", method = RequestMethod.GET)
    public String getConsolesByManufacturer(@PathVariable String manufacturer){
        return service.getManufacturer(manufacturer);
    }
    @RequestMapping(value = "/consoles/{id}", method = RequestMethod.DELETE)
    public Integer deleteConsolebyId(@PathVariable int consoleId){
        return service.getConsoleId(consoleId);
    }
    @RequestMapping(value = "/consoles/{id}", method = RequestMethod.PUT)
    public void updateConsole(@RequestBody @Valid Consoles console, @PathVariable int consoleId){
        service.save(console);
    }
    @RequestMapping(value = "/consoles", method = RequestMethod.POST)
    public Consoles addConsole(@RequestBody @Valid Consoles console){
        service.save(console);
        return console;
    }
}
