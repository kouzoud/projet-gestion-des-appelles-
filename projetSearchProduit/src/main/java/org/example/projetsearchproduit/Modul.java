package org.example.projetsearchproduit;

import metier.entiter.Produit;

import java.util.ArrayList;
import java.util.List;

public class Module {
    private String moc="";
    private long Id;
    List<Produit> produits=new ArrayList<Produit>();

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public String getMoc() {
        return moc;
    }

    public void setMoc(String moc) {
        this.moc = moc;
    }

    public Module() {
    }

    public Module(String moc, long id, List<Produit> produits) {
        this.moc = moc;
        Id = id;
        this.produits = produits;
    }
}
