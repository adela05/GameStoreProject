package com.compay.GameStoreProject.Repositories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="salesTax")
public class Tax {
    @Length(max = 2)
    private Character state;
    private Double taxRate;

    public Character getState() {
        return state;
    }

    public void setState(Character state) {
        this.state = state;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }
}
