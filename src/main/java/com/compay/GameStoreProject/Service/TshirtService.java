
package com.compay.GameStoreProject.Service;


import com.compay.GameStoreProject.Repositories.Games;
import com.compay.GameStoreProject.Repositories.TShirtRepository;
import com.compay.GameStoreProject.Repositories.TShirts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TshirtService {
    @Autowired
    private TShirtRepository tShirtRepo;

    // Save a TShirt
    public TShirts saveTShirt(TShirts tShirts){
        tShirtRepo.save(tShirts);
        return tShirts;
    }

    // Search all TShirt List
    public List<TShirts> getAllTShirts(){
        return tShirtRepo.findAll();
    }

    // Get a TShirt by Id
    public TShirts updateTShirtById(int id){
        return tShirtRepo.getOne(id);
    }

    // Delete a TShirt
    public void deleteTShirt(int id){
        tShirtRepo.deleteById(id);
    }

    // Search by Color
    public List<TShirts> findByColor(String color){
        return tShirtRepo.findAll();
    }
    // Search by size
    public List<TShirts> findBySize(String size){
        return tShirtRepo.findAll();
    }
}

