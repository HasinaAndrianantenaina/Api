package com.permis.gestion_rendez_vous.Dto;
//anokafo terminal hoe
import com.permis.gestion_rendez_vous.Entity.Category;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class AppointmentDto {
    public long id;
    public  long Category;
    public  long Person;
    public  long Permis;
    public LocalDate Date;
    public LocalTime Heure;
    public Long getPermis;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCategory() {
        return Category;
    }

    public void setCategory(long category) {
        Category = category;
    }

    public long getPerson() {
        return Person;
    }

    public void setPerson(long person) {
        Person = person;
    }

    public long getPermis() {
        return Permis;
    }

    public void setPermis(long permis) {
        Permis = permis;
    }

    public LocalTime getHeure() {
        return Heure;
    }

    public void setHeure(LocalTime heure) {
        Heure = heure;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }
}
