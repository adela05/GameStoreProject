package com.compay.GameStoreProject.Service;

import com.compay.GameStoreProject.Repositories.TaxRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InvoiceService {
    @Autowired
    private TaxRepository taxRepo;

    // method
    public Character getState(Character state){
        taxRepo.findByState(state);
        return state;
    }
    // method
    public double taxes(Double rate){
        return taxRepo.findByRate(rate);
    }
    public double subFee(Double addition){
        return taxRepo.getSubtotal() * addition;
    }
    public Double processing(Integer quantity){
        if(quantity >= 10){
            taxRepo.subFee(additional);
        }
        else if(invoice.getType.equals(“Tshirt”)){

        }

    }

}
