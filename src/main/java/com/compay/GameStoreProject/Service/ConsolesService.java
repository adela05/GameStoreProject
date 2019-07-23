package com.compay.GameStoreProject.Service;

import com.compay.GameStoreProject.Repositories.ConsoleRepository;
import com.compay.GameStoreProject.Repositories.Consoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
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

    // Update a Console by ID
    public Consoles updateConsoleById(Integer id){
         return consoleRepo.getOne(id);
    }

    // Delete a Console
    public Consoles deleteConsoleById(int id){ consoleRepo.deleteById(id);
        return null;
    }
    public List<Consoles> getConsoleByManufacturer(String manufacturer){
        return consoleRepo.findAll();
    }

}
