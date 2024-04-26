package com.permis.gestion_rendez_vous.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Person")

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(length = 12, name = "CIN")
    private int CIN;
    @Column(length = 200, name = "Declaration_perte")
    private String Declaration_perte;
    @Column(length = 200, name = "Certificat_medical")
    private String Certificat_medical;
    @Column(length = 200, name = "Auto_ecole_name")
    private String Auto_ecole_name;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = this.id;
    }
    public int getCIN() {
        return CIN;
    }
    public void setCIN(int CIN) {
        this.CIN = CIN;
    }
    public String getDeclaration_perte() {
        return Declaration_perte;
    }
    public void setDeclaration_perte(String declaration_perte) {
        Declaration_perte = declaration_perte;
    }
    public String getCertificat_medical() {
        return Certificat_medical;
    }
    public void setCertificat_medical(String certificat_medical) {
        Certificat_medical = certificat_medical;
    }
    public String getAuto_ecole_name() {
        return Auto_ecole_name;
    }
    public void setAuto_ecole_name(String auto_ecole_name) {
        Auto_ecole_name = auto_ecole_name;
    }
}
