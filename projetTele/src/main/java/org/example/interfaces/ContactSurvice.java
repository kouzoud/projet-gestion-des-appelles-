package org.example.interfaces;

import org.example.classes.Appelle;
import org.example.classes.AppelleEmis;
import org.example.classes.AppelleRecus;
import org.example.classes.Contact;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface ContactSurvice {
    public void addContact(Contact contact);
    public  void enregstrer(Appelle appelle,String numerotele);
    public Contact consulter(int numero);
    public List<Contact> consulter(String mc);
    public  double coutTotal();
    public  double couAppel(Date d1 ,Date d2);
    public  double coutotalAppel(int numero);



}
