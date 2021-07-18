package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cities")
public class City {
    private Long ID;
    private String Name;

}
