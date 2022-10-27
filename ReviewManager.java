// Assignment:
// Name:
// StudentID:
// Lecture:
// Description:

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

}
