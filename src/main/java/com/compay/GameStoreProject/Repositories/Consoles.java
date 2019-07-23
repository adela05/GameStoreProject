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
@Table(name="consoles")
public class Consoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer consoleId;
    @NotEmpty
    @Length(max = 50)
    private String model;
    @NotEmpty
    @Length(max = 50)
    private String manufacturer;
    @NotEmpty
    @Length(max = 20)
    private String memoryAmount;
    @NotEmpty
    @Length(max = 20)
    private String processor;
    @NotNull
    @Length(max = 5, min = 2)
    private Double price;
    @NotNull
    @Length(max = 11)
    private Integer quantity;


    public Integer getConsoleId() {
        return consoleId;
    }

    public void setConsoleId(Integer consoleId) {
        this.consoleId = consoleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer(String manufacturer) {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(String memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
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
