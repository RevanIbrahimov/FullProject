/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.javaapplication;

import java.util.Date;

/**
 *
 * @author ipi
 */
public class DataList {
    
    
            private int Id;
            private SiteClass site_Id;
            private CatData cat_Data;
            private String name;
            private String number;
            private float price2;
            private float price3;
            private float price;
            private String link;
            private Date hesabDate;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public SiteClass getSite_Id() {
        return site_Id;
    }

    public void setSite_Id(SiteClass site_Id) {
        this.site_Id = site_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getHesabDate() {
        return hesabDate;
    }

    public void setHesabDate(Date hesabDate) {
        this.hesabDate = hesabDate;
    }

    public float getPrice2() {
        return price2;
    }

    public void setPrice2(float price2) {
        this.price2 = price2;
    }

    public float getPrice3() {
        return price3;
    }

    public void setPrice3(float price3) {
        this.price3 = price3;
    }

    public CatData getCat_Data() {
        return cat_Data;
    }

    public void setCat_Data(CatData cat_Data) {
        this.cat_Data = cat_Data;
    }
            
            
    
}
