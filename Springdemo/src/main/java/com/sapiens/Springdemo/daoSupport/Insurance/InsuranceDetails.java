package com.sapiens.Springdemo.daoSupport.Insurance;

import javax.persistence.*;

@Entity
@Table(name = "InsuranceDetails")
public class InsuranceDetails {
    @Id
    @Column(name = "i_details_id")
    int i_details_id;
    String insuranceType;
    String valid_till;
    int premium_amount;

    @Override
    public String toString() {
        return "InsuranceDetails{" +
                "i_details_id=" + i_details_id +
                ", insuranceType='" + insuranceType + '\'' +
                ", valid_till='" + valid_till + '\'' +
                ", premium_amount='" + premium_amount + '\'' +
                '}';
    }

    public int getI_details_id() {
        return i_details_id;
    }

    public void setI_details_id(int i_details_id) {
        this.i_details_id = i_details_id;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getValid_till() {
        return valid_till;
    }

    public void setValid_till(String valid_till) {
        this.valid_till = valid_till;
    }

    public int getPremium_amount() {
        return premium_amount;
    }

    public void setPremium_amount(int premium_amount) {
        this.premium_amount = premium_amount;
    }
}
