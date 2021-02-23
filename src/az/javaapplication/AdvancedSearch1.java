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
public class AdvancedSearch1 {
    
    private String minAmount;
    private String maxAmount;
    private Date beginDate;
    private Date endDate;
    private String akeyword;

    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

 

    public String getAkeyword() {
        return akeyword;
    }

    public void setAkeyword(String akeyword) {
        this.akeyword = akeyword;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
}
