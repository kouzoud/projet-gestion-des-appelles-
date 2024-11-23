package org.example.classes;

import java.util.Date;

public class AppelleEmis extends Appelle{
    @Override
    public double coute() {
        return dure*2;
    }

    public AppelleEmis(int  numero, Date date, double dure) {
        super(numero, date, dure);
    }

    public AppelleEmis() {
    }
}

