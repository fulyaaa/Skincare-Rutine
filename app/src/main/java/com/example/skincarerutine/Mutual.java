package com.example.skincarerutine;

import java.io.Serializable;

public class Mutual implements Serializable {

    String name;
    String cleaning;
    String tonic;
    String moisturizer;
    int image;


    public Mutual(String name, String cleaning, String tonic,String moisturizer, int image){
        this.name=name;
        this.cleaning=cleaning;
        this.tonic=tonic;
        this.moisturizer=moisturizer;
        this.image=image;
    }

}
