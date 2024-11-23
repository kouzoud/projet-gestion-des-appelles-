package org.example;

import org.codehaus.jackson.map.ObjectMapper;
import org.example.classes.AppelleEmis;
import org.example.classes.AppelleRecus;
import org.example.classes.Apppariel;
import org.example.classes.Contact;
import org.example.interfaces.ContactSurvice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        ContactSurvice apparail =new Apppariel();
        AppelleEmis appelleEmis=new AppelleEmis();
        Contact contact=new Contact(12,"simo","0651830651");
        Contact contact1=new Contact(11,"kouzoud","0651830651");
        Contact contact2=new Contact(13,"sima","0651830651");
        Contact contact3=new Contact(14,"maamaaam","0651830651");
        Contact contact4 =new Contact(15,"sisa","0651830651");
        apparail.addContact(contact1);
        apparail.addContact(contact);
        apparail.addContact(contact2);
        apparail.addContact(contact3);
        apparail.addContact(contact4);
        apparail.enregstrer(new AppelleRecus(1,new Date(),18),"0651883");
        apparail.enregstrer(new AppelleEmis(1,new Date(),18),"0651883");
        System.out.println(apparail.consulter(11).ToString());
        Contact c =apparail.consulter(11);
        System.out.println("nom: "+c.getNom()+" numer: "+c.getNumero()+" tele: "+c.getNumeroTele());
        List<Contact> list= apparail.consulter("si");
        for (Contact acc:list) System.out.println(acc.ToString());
        for (Contact acc:list) System.out.println(acc.toString());
        System.out.println(apparail.consulter("si"));
//        System.out.println(apparail.coutTotal());
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
//        Date d1=simpleDateFormat.parse("11/10/2022");
//        Date d2 =simpleDateFormat.parse("12/11/2023");
//        System.out.println(apparail.couAppel(d1,d2));
        Contact c1=new Contact();
        System.out.println(c1);

    }

    public String tojuson(Object o){
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(o); // Convertir l'objet en JSON
        } catch (Exception e) {
            e.printStackTrace();
            return "not found json"; // Retourner null en cas d'erreur
        }
    }
}