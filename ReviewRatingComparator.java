// Assignment: 8
// Name: Sherwin Wang
// StudentID: 1224486887
// Lecture: M W F 10:10 AM - 11:00 AM
// Description: Compares hotels using rating criteria

import java.util.Comparator;

public class ReviewRatingComparator implements Comparator<Hotel>{
    public ReviewRatingComparator(){

    }

    public int compare(Hotel first, Hotel second){

        int result = 0;

        if(first.getStars() != second.getStars()){
            result =  (int)(Math.abs(first.getStars() - second.getStars()));
        }
        else {
            if(first.getHotelName().compareTo(second.getHotelName()) < 0){
                result = 1;
            }
            if(first.getHotelName().compareTo(second.getHotelName()) > 0){
                result = 2;
            }
            else{
                if(first.getLocation().compareTo(second.getLocation()) < 0){
                    result = 1;
                }
                if(first.getLocation().compareTo(second.getLocation()) > 0){
                    result = 2;
                }
                else{
                    if(first.getReview().compareTo(second.getReview()) < 0){
                        result = 1;
                    }
                    if(first.getReview().compareTo(second.getReview()) > 0){
                        result = 2;
                    }
                }
            }
        }
        return result;
    }
}