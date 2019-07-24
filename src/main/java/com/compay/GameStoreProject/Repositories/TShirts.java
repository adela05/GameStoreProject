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
@Table(name="tShirts")
public class TShirts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tShirtId;
    @NotEmpty
    @Length(max = 20)
    private String size;
    @NotEmpty
    @Length(max = 20)
    private String color;
    @NotEmpty
    private String description;
    @NotNull
    //@Length(max = 5, min = 2)
    private Double price;
    @NotNull
    //@Length(max = 11)
    private Integer quantity;

    public Integer getTShirtId() {
        return tShirtId;

    }

    public void setTShirtId(Integer tShirtId) {
        this.tShirtId = tShirtId;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}

