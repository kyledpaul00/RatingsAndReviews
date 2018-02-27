package code;

import java.util.ArrayList;

import code.ratables.Ratable;

public class Driver{

    /**
     * This class contains test code that calls the methods from RatingsManager. You can, and should, edit
     * this file to test various aspects of your program or to find new music
     */
    public static void main(String[] args){

        String filenameAllSongs = "data/all_ratings.csv";
        String filenameProducts = "data/amazonReviews.csv";

        // Edit these values to change the program behavior
        int numberOfExtraRatings = 3;
        double extraRatingValue = 3.0;
        double threshold = 4.2;
        int k = 20;
        ArrayList<Integer> t = new ArrayList<>();
        t.add(564);
        t.add(463);
        t.add(842);
        t.add(535);
        System.out.println(t.size());

        // uncomment this code as you implement the methods to test their functionality
       
//        ArrayList<Ratable> products = RatingsManager.readProductCSVFile(filenameProducts);
//
//        ArrayList<Ratable> songsAboveThreshold = RatingsManager.bayesianRatingThreshold(songs, numberOfExtraRatings, extraRatingValue, threshold);
//        RatingsManager.printList(songsAboveThreshold);
//
//        ArrayList<Ratable> productsAboveThreshold = RatingsManager.bayesianRatingThreshold(products, numberOfExtraRatings, extraRatingValue, threshold);
//        RatingsManager.printList(productsAboveThreshold);
//
//        RatingsManager.sortAlphabetically(songs);
//        RatingsManager.printList(songs);
//
//
//        System.out.println();
//        RatingsManager.printList(RatingsManager.getTopK(songs, k, new BayesianAverageComparator(numberOfExtraRatings, extraRatingValue)));
//
//        System.out.println();
//        RatingsManager.printList(RatingsManager.getTopK(products, k, new BayesianAverageComparator(numberOfExtraRatings, extraRatingValue)));
    }

}
