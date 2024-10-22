package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;


    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }
    public Date getExpirationDate(){
        return this.expirationDate;
    }
    public String getSpecificData(){
        return "Localización " + zone + "\nLa fecha de caducidad es: " +getFormattedDate(expirationDate);
    }
    public String getFormattedDate(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(fecha);
    }
    public void printSpecificData(){
        System.out.println(getSpecificData());
    }
}
