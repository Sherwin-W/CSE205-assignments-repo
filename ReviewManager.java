// Assignment: 8
// Name: Sherwin Wang
// StudentID: 1224486887
// Lecture: M W F 10:10 AM - 11:00 AM
// Description: ReviewManager with methods concerning hotel arraylist

import java.io.Serializable;
import java.util.ArrayList;

public class ReviewManager implements Serializable {
    // The serialVersionUID is used to verify compatibility of senders and
    // receivers. See the document for more details:
    // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html
    private static final long serialVersionUID = 205L;

    ArrayList<Hotel> reviewList;

    public ReviewManager() {
        reviewList = new ArrayList<>();
    }

    /**
     * Add a Hotel object to the reviewList and return true if such an object
     * is added successfully. Otherwise, return false. Two hotels are
     * considered duplicated if they have exactly the same hotel name and
     * hotel type.
     * 
     * @param  hotelName     the name of the hotel
     * @param  stars         the number of stars for the hotel
     * @param  review        the hotel review
     * @param  priceRange    the integer price range
     * @param  type          the hotel's type
     * @param  location      the hotel location (street address)
     * @param  topFeature    most famous feature of the hotel
     * @return               true if the operation is successful; false otherwise
     */

    public int hotelExists(String hotelName, String location){
        int index = -1;
        Hotel place;
        for(int i = 0; i < reviewList.size(); i++){
            place = reviewList.get(i);
            if(hotelName.equals(place.getHotelName()) && location.equals(place.getLocation())){
                index = i;
            }
        }
        return index;
    }


    public ArrayList<Integer> hotelTypeExists(String hotelType){
        ArrayList<Integer> indexList = new ArrayList<>();
        Hotel place;
        for(int i = 0; i < reviewList.size(); i++){
            place = reviewList.get(i);
            if(hotelType.equals(place.getHotelType().getType())){
                indexList.add(i);
            }
        }
        return indexList;
    }

    public Hotel getHotel(int i){
        return reviewList.get(i);
    }

    public boolean addReview(String hotelName, int stars, String review, String priceRange, String type, String location, String topFeature) {
        if (hotelExists(hotelName, location) == -1) {
            int price = priceRange.length();
            HotelType newType = new HotelType(type, topFeature);
            Hotel newHotel = new Hotel(hotelName, stars, review, price, location, newType);
            reviewList.add(newHotel);
            return true;
        }
        return false;
    }

    public void removeReview(String hotelName, String location){
        Hotel place;
        for(int i = 0; i < reviewList.size(); i++){
            place = reviewList.get(i);
            if(hotelName.equals(place.getHotelName()) && location.equals(place.getLocation())){
                reviewList.remove(i);
                break;
            }
        }
    }

    public void sortByRating(){
        ReviewRatingComparator ratComp = new ReviewRatingComparator();
        Sorts.sort(reviewList, ratComp);
    }

    public void sortByHotelType(){
        ReviewHotelTypeComparator hotComp = new ReviewHotelTypeComparator();
        Sorts.sort(reviewList, hotComp);
    }

    public String listReviews(){
        String result = "";
        for(int i = 0; i < reviewList.size(); i++){
            result += reviewList.get(i).toString();
        }
        return result;
    }

    public void closeReviewManger(){
        reviewList.clear();
    }

}
