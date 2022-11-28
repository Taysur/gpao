package com.helloworld.demoproject.entities;

import java.text.DecimalFormat;
import java.util.Date;

public class of {

    private Integer of_id;
    private Date date_of;
    private DecimalFormat prix_unit;
    private Integer qte_com;
    private Integer temp_unit;

    
    public Integer getOf_id() {
        return of_id;
    }
    public void setOf_id(Integer of_id) {
        this.of_id = of_id;
    }
    public Date getDate_of() {
        return date_of;
    }
    public void setDate_of(Date date_of) {
        this.date_of = date_of;
    }
    public DecimalFormat getPrix_unit() {
        return prix_unit;
    }
    public void setPrix_unit(DecimalFormat prix_unit) {
        this.prix_unit = prix_unit;
    }
    public Integer getQte_com() {
        return qte_com;
    }
    public void setQte_com(Integer qte_com) {
        this.qte_com = qte_com;
    }
    public Integer getTemp_unit() {
        return temp_unit;
    }
    public void setTemp_unit(Integer temp_unit) {
        this.temp_unit = temp_unit;
    }
    
}
