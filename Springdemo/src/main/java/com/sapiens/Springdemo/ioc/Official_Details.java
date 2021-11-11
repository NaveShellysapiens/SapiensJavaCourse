package com.sapiens.Springdemo.ioc;

public class Official_Details {

   String edu_qualification;
   String percentage;
   String Designation;
   String years_of_experience;
   String current_company_name;

    public void setEdu_qualification(String edu_qualification) {
        this.edu_qualification = edu_qualification;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public void setYears_of_experience(String years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    public void setCurrent_company_name(String current_company_name) {
        this.current_company_name = current_company_name;
    }

    public String getEdu_qualification() {
        return edu_qualification;
    }

    public String getPercentage() {
        return percentage;
    }

    public String getDesignation() {
        return Designation;
    }

    public String getYears_of_experience() {
        return years_of_experience;
    }

    public String getCurrent_company_name() {
        return current_company_name;
    }
}
