package com.permis.gestion_rendez_vous.Entity;
import jakarta.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name ="Appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "id_category")
    private Category category;
    @OneToOne
    @JoinColumn(name = "id_person")
    private Person person;
    @OneToOne
    @JoinColumn(name = "id_permis")
    private Permis permis;

    @Column(length = 12, name = "date")
    private LocalDate Date;

    @Column(length = 8, name = "time")
    private LocalTime Time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Permis getPermis() {
        return permis;
    }

    public void setPermis(Permis permis) {
        this.permis = permis;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public LocalTime getTime() {
        return Time;
    }

    public void setTime(LocalTime time) {
        Time = time;
    }
}
