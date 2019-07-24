package com.compay.GameStoreProject.Service;

import com.compay.GameStoreProject.Repositories.ConsoleRepository;
import com.compay.GameStoreProject.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InvoiceService {
    @Autowired
    private TaxRepository taxRepo;

    // method
    public double taxes(Character state){
        Double stateRate;
       invoiceRepo.findByState(state);
       return ;
    }
    // method
    public double subtotal(Integer quantity, Double unitPrice){
       return invoiceRepo.findSubtotal(quantity * unitPrice);
    }
    public double subFee(Double addition){
        return invoiceRepo.getSubtotal() * addition;
    }
    public Double processing(Integer quantity){
        if(quantity >= 10){
            Taxes.subFee(additional);
        }
        else if(invoice.getType.equals(“Tshirt”)){

        }

    }
}
