package org.example.classes;

import org.codehaus.jackson.map.ObjectMapper;
import org.example.interfaces.ContactSurvice;

import java.util.*;

public class Apppariel implements ContactSurvice {
   private List<Contact> listContact=new ArrayList<>();
   private Map<Integer,Appelle> appelleMap=new HashMap<Integer,Appelle>();
    @Override
    public void addContact(Contact contact) {
        listContact.add(contact);
    }

    @Override
    public void enregstrer(Appelle appelle, String numerotele) {
       Contact c =new Contact(11,"sdf","sdf");
        for (Contact acc:listContact){
            if(acc.getNumeroTele().equals(numerotele)){c=acc;}
            break;
        }
        appelle.setContact(c);
        appelleMap.put(appelle.getNumero(),appelle);

    }

    @Override
    public Contact consulter(int numero){
        for (Contact acc:listContact){
            if (acc.getNumero()==numero){return acc;}
        } throw new RuntimeException("contact not existe");
    }

    @Override
    public List<Contact> consulter(String mc) {
        List<Contact> cts =new ArrayList<>();
        for (Contact acc:listContact){
            if (acc.getNom().indexOf(mc)>=0) cts.add(acc);;
        }
        return cts;
    }

    @Override
    public double coutTotal() {
        double totale=0;
        for (Appelle acc:appelleMap.values()){
            totale+= acc.coute();
        }
        return totale;
    }

    @Override
    public double couAppel(Date d1, Date d2) {
        double totale=0;
        for (Appelle acc:appelleMap.values()){
            if (acc.getDate().getTime()>=d1.getTime() && acc.getDate().getTime()<=d2.getTime()){
                totale+= acc.coute();
        }

    }return totale;
    }

    @Override
    public double coutotalAppel(int numero) {
        double totale=0;
        for (Appelle acc:appelleMap.values()){
            if (acc.getContact().getNumero()==numero){
                totale+= acc.coute();
            }
        }
        return totale;
    }



}
