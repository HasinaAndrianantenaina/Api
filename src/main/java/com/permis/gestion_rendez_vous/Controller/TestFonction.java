package com.permis.gestion_rendez_vous.Controller;
public class TestFonction {
   int  calculAge(int dateNaissance, int dateActuelle) {
        int age = dateActuelle - dateNaissance;
        return calculAge() + age ;
    }

    private int calculAge() {
        return 0;
    }

    //condition if == si
    int condition(int dateActuelle, int dateNaissance, int age) {
        //si c = 1:  addition
        // si c = 2: soustraction;
        int resultat = 0;
        //si age plus petit que 18: afficher vous êtess mineur
        // si age plus grand que 18: vous êtes majeur
        if (age < 18) {
            System.out.println("vous êtess mineur");
        }
        if (age >= 18) {
            System.out.println("vous êtes majeur");
        }
        return age  + resultat;
    }
}
/*
    // function1: calcule age
    // variable: anné de naissance, année actuelle
    // age = année actuelle - année de naissance

int calcul_age( int date_naissance, int anne_actuelle) {
    date_naissance = 2015;
    anne_actuelle = 2024;
    int age = anne_actuelle - date_naissance;
  //  System.out.println(age);

    return age;
}




    //function 2: calcule age
    //si age plus petit que 18: afficher vous êtess mineur
    // si age plus grand que 18: vous êtes majeur
}
*/