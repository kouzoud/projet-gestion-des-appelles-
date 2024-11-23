package org.example.classes;

import java.util.Date;

public abstract class Appelle   {
    protected int  numero;
    protected Date date;
    protected double dure;
    public  Contact contact;
    public abstract double coute();

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Appelle() {
    }
    public Appelle(int  numero, Date date, double dure) {
        this.numero = numero;
        this.date = date;
        this.dure = dure;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDure() {
        return dure;
    }

    public void setDure(double dure) {
        this.dure = dure;
    }
    public String toString(){
        return "la dure est "+this.dure + "la date est"+this.date+"numero est"+this.numero;
    }
}
