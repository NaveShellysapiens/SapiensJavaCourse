package com.sapiens.Springdemo.ioc;

public class Contact {
    String primary_Mobile_no;
    String Secondary_Mobile_no;
    String emergency_Contact_no;
    String email_id;
    String Official_mail_id;

    public void setPrimary_Mobile_no(String primary_Mobile_no) {
        this.primary_Mobile_no = primary_Mobile_no;
    }

    public void setSecondary_Mobile_no(String secondary_Mobile_no) {
        Secondary_Mobile_no = secondary_Mobile_no;
    }

    public void setEmergency_Contact_no(String emergency_Contact_no) {
        this.emergency_Contact_no = emergency_Contact_no;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public void setOfficial_mail_id(String official_mail_id) {
        Official_mail_id = official_mail_id;
    }

    public String getPrimary_Mobile_no() {
        return primary_Mobile_no;
    }

    public String getSecondary_Mobile_no() {
        return Secondary_Mobile_no;
    }

    public String getEmergency_Contact_no() {
        return emergency_Contact_no;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getOfficial_mail_id() {
        return Official_mail_id;
    }
}
