package com.example.simon.rentallistview;

//Base class to hold information about our property
public class Property implements Serializable  {

    //property basics
    private int streetNumber;
    private String streetName;
    private String suburb;
    private String state;
    private String description;
    private String image;
    private Double price;
    private int bedrooms;
    private int bathrooms;
    private int carspots;
    private Boolean featured;

    //constructor
    public Property(
            int streetNumber, String streetName, String suburb, String state,
            String description, Double price, String image, int bedrooms, int bathrooms, int carspots, Boolean featured){

        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.suburb = suburb;
        this.state = state;
        this.description = description;
        this.price = price;
        this.image = image;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.carspots = carspots;
        this.featured = featured;
    }

    //getters
    public int getStreetNumber() { return streetNumber; }
    public String getStreetName() {return streetName; }
    public String getSuburb() {return suburb; }
    public String getState() {return state; }
    public String getDescription() {return description; }
    public Double getPrice() {return price; }
    public String getImage() { return image; }
    public int getBedrooms(){ return bedrooms; }
    public int getBathrooms(){ return bathrooms; }
    public int getCarspots(){ return carspots; }
    public Boolean getFeatured(){return featured; }
}
