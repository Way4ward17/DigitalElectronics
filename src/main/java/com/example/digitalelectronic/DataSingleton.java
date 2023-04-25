package com.example.digitalelectronic;

public class DataSingleton {
    public static final DataSingleton instance = new DataSingleton();
    public String links;

    private DataSingleton(){}

    public static DataSingleton getInstance(){
        return instance;
    }

    public String getLinks(){
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }
}
