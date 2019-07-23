package com.compay.GameStoreProject.Service;

import com.compay.GameStoreProject.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsolesService {
    @Autowired

    private ConsoleRepository consoleRepo;

    // Save a Console
    public Consoles saveConsole(Consoles consoles){
        consoleRepo.save(consoles);
        return consoles;
    }

    // Search all Consoles List
    public List<Consoles> getAllConsoles(){
        return consoleRepo.findAll();
    }

    // Get a Console by ID
    public Consoles getConsoleById(int id){
        return consoleRepo.getOne(id);
    }

    // Delete a Console
    public void deleteConsoles(int id){ consoleRepo.deleteById(id);
    }
}
