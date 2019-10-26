package com.example.sorianojericholabexer4;

public class AndroidVersion {
    private int logo;
    private String name, country, industry, ceo;


    public AndroidVersion(int logo, String name, String country, String industry, String ceo) {
        this.logo = logo;
        this.name = name;
        this.country = country;
        this.industry = industry;
        this.ceo = ceo;

    }

    public int getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getIndustry() {
        return industry;
    }

    public String getCeo() {
        return ceo;
    }

}

