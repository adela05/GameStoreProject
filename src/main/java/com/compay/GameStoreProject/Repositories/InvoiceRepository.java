package com.compay.GameStoreProject.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{
    List<Invoice> findByInvoiceId(Integer id);
    List<Invoice> findSubtotal(Double subtotal);
    List<Invoice> findByState(String state);
}
