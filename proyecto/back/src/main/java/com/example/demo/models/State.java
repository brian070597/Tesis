package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="state")
public class State {


    @Id
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "countryId, nullable = false)
    private Warehouse warehouse;

}
