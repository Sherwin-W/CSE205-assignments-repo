// Assignment: 8
// Name: Sherwin Wang
// StudentID: 1224486887
// Lecture: M W F 10:10 AM - 11:00 AM
// Description: Sorts the hotel list

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorts{
    public static void sort(ArrayList<Hotel> reviewList, Comparator<Hotel> xComparator){
        for(int i = 0; i < reviewList.size() - 1; i++){
            int min = i;
            for(int j = i+1; j < reviewList.size(); j++){
                if(xComparator.compare(reviewList.get(i), reviewList.get(min)) == -1){
                    min = j;

                    if(min != i){
                        Collections.swap(reviewList, i, min);
                    }
                }
            }
        }
    }
}