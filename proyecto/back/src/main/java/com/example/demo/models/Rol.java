package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.springframework.validation.annotation.Validated;
@Validated
@Data
@Entity
@Table(name="Rol")
public class Rol {
    @Id
    private Long ID;

    private String Description;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Rol(Long ID, String description) {
        this.ID = ID;
        Description = description;
    }
}
