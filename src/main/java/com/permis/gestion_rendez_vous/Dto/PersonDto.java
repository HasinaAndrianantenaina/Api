package com.permis.gestion_rendez_vous.Dto;


public class PersonDto {
    public long id;
    public int CIN;
    public String Declaration_perte;
    public String Certificat_medical;
    public String Auto_ecole_name;

    public int age;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
