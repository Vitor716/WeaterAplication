package com.example.weatheraplication;

public class Model {

    private  int id;
    private String latt;
    private String location;
    private String title;

    public Model(){
        this.id = id;
        this.latt = latt;
        this.location = location;
        this.title = title;
    }

    public Model(int customID,  String customLatt, String customLocation, String customTitle){
        this.id = customID;
        this.latt = customLatt;
        this.location = customLocation;
        this.title = customTitle;
    }


    @Override
    public String toString() {
        return "Model{" +
                ", id=" + id +
                ", latt ='" + latt + '\'' +
                ", location ='" + location + '\'' +
                ", title ='" + title + '\'' +
                '}';
    }

    //Getters and Setters

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getLatt() { return latt; }

    public String getLocation() { return location; }


    public String getTitle() { return title; }

    public void setLatt(String latt) { this.latt = latt; }
    public void setLocation(String location) { this.location = location; }
    public void setTitle(String title) { this.title = title; }
}