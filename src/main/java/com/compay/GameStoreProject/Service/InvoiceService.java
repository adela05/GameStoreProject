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
    public double findByTaxRate(Double rate){
        taxRepo.findByRate(rate);
        return rate;
    }

    public double subFee(Integer quantity, Double unitPrice){
        Double subtotal= quantity * unitPrice;
        return subtotal;
    }
    public double taxFee(Double subtotal, Double taxRate){
        Double result = subtotal * taxRate;
        return result;
    }
//    public Double processing(Integer quantity){
//        Double additionalFee =15.49;
//        if(quantity >= 10){
//            taxRepo.subtotal + additionalFee;
//        }
//        else if(invoice.getType.equals(“Tshirt”)){
//
//        }
//
//    }

}
