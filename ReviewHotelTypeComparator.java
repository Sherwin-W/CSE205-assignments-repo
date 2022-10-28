import java.util.Comparator;

public class ReviewHotelTypeComparator implements Comparator<Hotel>{
    public ReviewHotelTypeComparator(){
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