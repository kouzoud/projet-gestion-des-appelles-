package org.example.classes;

import org.codehaus.jackson.map.ObjectMapper;
import org.example.interfaces.ContactSurvice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contact {
    private int numero;
    private String nom;
    private String numeroTele;
    public Appelle appelle;
//    ArrayList<Contact> contactsliste = new ArrayList<>();

    public Appelle getAppelle() {
        return appelle;
    }

    public void setAppelle(Appelle appelle) {
        this.appelle = appelle;
    }

    public Contact(int numero, String nom , String numeroTele){
        this.numero=numero;
        this.nom=nom;
        this.numeroTele=numeroTele;
    }

    public Contact() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroTele() {
        return numeroTele;
    }

    public void setNumeroTele(String numeroTele) {
        this.numeroTele = numeroTele;
    }

    public String ToString(){
        return "le nom est "+this.nom+" numero tele est "+this.numeroTele+" numero est "+this.numero;
    }
    public String toString(){
        return "("+this.numero+") ("+this.nom+") ("+this.numeroTele+")";
    }


}
