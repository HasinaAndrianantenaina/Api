package com.permis.gestion_rendez_vous.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Permis")
public class Permis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "Bordereau")
    private String Bordereau;
    @Column(name = "Reference")
    private String Reference;
    @Column(name = "Date_obtention")
    private Date Date_obtention;
    @Column(name = "Category")
    private String Category;
    @Column(name = "Ancien_permis")
    private String Ancien_permis;
}
