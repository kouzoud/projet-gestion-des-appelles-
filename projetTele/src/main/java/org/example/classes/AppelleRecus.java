package org.example.classes;

import java.util.Date;

public class AppelleRecus  extends  Appelle{
    @Override
    public double coute() {
        return 0;
    }

    public AppelleRecus() {
    }

    public AppelleRecus(int numero, Date date, double dure) {
        super(numero, date, dure);
    }
}
