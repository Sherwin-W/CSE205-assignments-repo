// Assignment: 8
// Name: Sherwin Wang
// StudentID: 1224486887
// Lecture: M W F 10:10 AM - 11:00 AM
// Description: Compares hotels with hoteltype criteria

import java.util.Comparator;

public class ReviewHotelTypeComparator implements Comparator<Hotel>{
    public ReviewHotelTypeComparator(){
    }
    public int compare(Hotel first, Hotel second){
        int result = 0;

        if(first.getHotelType() == second.getHotelType()){
            if(first.getPriceRange() == second.getPriceRange()){
                if(first.getHotelName().compareTo(second.getHotelName()) < 0){
                    result = 1;
                }
                else{
                    result = 2;
                }
            }
            else if(first.getPriceRange() > second.getPriceRange()){
                result = 2;
            }
            else{
                result = 1;
            }
        }
        else if(first.getHotelType().getType().compareTo(second.getHotelType().getType()) < 0){
                result = 1;
            }
            else{
                result = 2;
            }
        return result;
    }
        
}