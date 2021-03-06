package com.compay.GameStoreProject.Repositories;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="game")
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer gameId;
    @NotEmpty
    @Length(max = 50)
    private String title;
    @NotEmpty
    @Length(max = 50)
    private String esrbrating;  // Everyone, Teen, Mature, Adult
    @NotEmpty
    private String description;
    @NotNull
    @Length(max = 5, min = 2)
    private Double price;
    @NotEmpty
    @Length(max = 50)
    private String studio;
    @NotNull
    @Length(max = 11)
    private Integer quantity;

    // Getters and Setters

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEsrbrating() {
        return this.esrbrating;
    }

    public void setEsrbrating(String esrbrating) {
        this.esrbrating = esrbrating;
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

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}
