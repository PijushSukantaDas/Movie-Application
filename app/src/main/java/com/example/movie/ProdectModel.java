package com.example.movie;

public class ProdectModel {

    public String name;
    public String price;
    public String code;
    public int image;

    public ProdectModel(String name, String price, String code, int image) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public String getPrice(){
        return price;
    }
    public String getCode(){
        return  code;
    }
    public String getName(){
        return name;
    }
}
