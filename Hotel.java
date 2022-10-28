// Assignment: 
// Name:
// StudentID:
// Lecture:
// Description:

import java.io.Serializable;

public class Hotel implements Serializable{
    private static final long serialVersionUID = 205L;
    private String hotelName;
    private int stars;
    private String review;
    private int priceRange;
    private String location;
    private HotelType hotelType;

    public Hotel(String hotelName, int stars, String review, int priceRange, String location, HotelType hotelType){
        this.hotelName = hotelName;
        this.stars = stars;
        this.review = review;
        this.priceRange = priceRange;
        this.location = location;
        this.hotelType = hotelType;
    }

    public String getHotelName(){
        return this.hotelName;
    }

    public int getStars(){
        return this.stars;
    }

    public int getPriceRange(){
        return this.priceRange;
    }

    public String getLocation(){
        return this.location;
    }

    public String getReview(){
        return this.review;
    }

    public HotelType getHotelType(){
        return this.hotelType;
    }

    public String toString(){
        String starString = "";
        String priceString = "";

        for (int i = 0; i < this.getStars(); i++){
            starString += "*";
        }
        for (int j = 0; j < this.getPriceRange(); j++){
            priceString += "$";
        }
        return hotelName + " hotel\n" + starString + "\t\t" + priceString + "\n" +  hotelType.toString() + "Location: " + location + "\n" + "Review:\t" + review + "\n\n";
    }
}