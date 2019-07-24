package com.compay.GameStoreProject.Repositories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="invoice")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    //@Length (max = 11)
    private Integer invoiceId;
    @NotEmpty
    @Length (max = 80)
    private String name;
    @NotEmpty
    @Length (max = 30)
    private String street;
    @NotEmpty
    @Length (max = 30)
    private String city;
    @NotEmpty
    @Length (max = 30)
    private String state;
    @NotEmpty
    @Length (max = 5)
    private String zipCode;
    @NotEmpty
    @Length (max = 20)
    private String itemType;
    @NotNull
    //@Length (max = 11)
    private Integer itemId;
    @NotNull
    //@Length (max = 5, min = 2)
    private Double unitPrice;
    @NotNull
    //@Length (max = 11)
    private Integer quantity;
    @NotNull
    //@Length(max = 5, min = 2)
    private Double subtotal;
    @NotNull
    //@Length(max = 5, min = 2)
    private Double tax;
    @NotNull
    //@Length(max = 5, min = 2)
    private Double processingFee;
    @NotNull
    //@Length(max = 5, min = 2)
    private Double total;

    public Invoice(String itemType, Integer itemId, Double unitPrice, Integer quantity, Double subtotal,
                   Double tax, Double processingFee, Double total) {
        this.itemType = itemType;
        this.itemId = itemId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.tax = tax;
        this.processingFee = processingFee;
        this.total = total;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(Double processingFee) {
        this.processingFee = processingFee;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
