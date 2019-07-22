package com.compay.GameStoreProject.Controllers;

import com.compay.GameStoreProject.Repositories.Consoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ConsoleController {
    @Autowired
    private Consoles consoleRepo;

    @RequestMapping(value = "/consoles", method = RequestMethod.GET)
    public List<Consoles> getAllConsoles(){
        return consoleRepo.findAll();
    }
    @RequestMapping(value = "/consoles/{manufacturer}", method = RequestMethod.GET)
    public String getConsolesByManufacturer(@PathVariable String manufacturer){
        return consoleRepo.getManufacturer(manufacturer);
    }
    @RequestMapping(value = "/consoles/{id}", method = RequestMethod.DELETE)
    public Integer deleteConsolebyId(@PathVariable int consoleId){
        return consoleRepo.getConsoleId(consoleId);
    }
    @RequestMapping(value = "/consoles/{id}", method = RequestMethod.PUT)
    public void updateConsole(@RequestBody @Valid Consoles console, @PathVariable int consoleId){
        consoleRepo.save(console);
    }
    @RequestMapping(value = "/consoles", method = RequestMethod.POST)
    public Consoles addConsole(@RequestBody @Valid Consoles console){
        consoleRepo.save(console);
        return console;
    }
}
