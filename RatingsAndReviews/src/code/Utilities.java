package code;

import java.util.ArrayList;

/**
 * This class contains a variety of methods that will be used throughout the Ratings and Reviews
 * project.
 */
public class Utilities{


    /**
     * Computes the average of any number of ratings
     *
     * @param ratings A list of integer ratings in the range of 1-5 inclusive
     * @return The average of all ratings in the list as a double
     */
    public static double averageRating(ArrayList<Integer> ratings){
        double sum = 0;
        for(int i : ratings){
            sum += i;
        }
        return sum / ratings.size();
    }

    /**
     * Computes the average of any number of ratings provided in Review objects
     *
     * @param reviews A list of integer ratings in the range of 1-5 inclusive
     * @return The average of all ratings in the list as a double
     */
    public static double averageRatingOfReviews(ArrayList<Review> reviews){
        double total = 0.0;
        for(Review review : reviews){
            total += review.getRating();
        }
        return total / reviews.size();
    }

    /**
     * Computes the Bayesian average of any number of reviews
     *
     * Hint: You can call your method from 3.1 to compute the standard average of the ratings then
     * call the Bayesian average method from part 1 to compute the Bayesian average.
     *
     * @param ratings              A list of integer ratings in the range of 1-5 inclusive
     * @param numberOfExtraRatings The number of extra ratings to be added to the average
     * @param extraRatingValue     The value of the extra ratings
     * @return The Bayesian average of all ratings in the list as a double
     */
    public static double bayesianAverage(ArrayList<Integer> ratings, int numberOfExtraRatings, double extraRatingValue){
        return bayesianAverage(averageRating(ratings), ratings.size(), numberOfExtraRatings, extraRatingValue);
    }


    /**
     * Computes the Bayesian average of any number of reviews provided in Review objects
     *
     * Hint: You can call your method from 3.1 to compute the standard average of the ratings then
     * call the Bayesian average method from part 1 to compute the Bayesian average.
     *
     * @param reviews              A list of integer ratings in the range of 1-5 inclusive
     * @param numberOfExtraRatings The number of extra ratings to be added to the average
     * @param extraRatingValue     The value of the extra ratings
     * @return The Bayesian average of all ratings in the list as a double
     */
    public static double bayesianAverageOfReviews(ArrayList<Review> reviews, int numberOfExtraRatings, double extraRatingValue){
        return bayesianAverage(averageRatingOfReviews(reviews), reviews.size(), numberOfExtraRatings, extraRatingValue);
    }

    /**
     * Computes the average of two ratings
     *
     * @param rating0 An integer rating in the range of 1-5 inclusive
     * @param rating1 An integer rating in the range of 1-5 inclusive
     * @return the average of rating0 and rating1 as a double
     */
    public static double averageRating(int rating0, int rating1){
        return (rating0 + rating1) / 2.0;
    }

    /**
     * Computes the average of three ratings
     *
     * @param rating0 An integer rating in the range of 1-5 inclusive
     * @param rating1 An integer rating in the range of 1-5 inclusive
     * @param rating2 An integer rating in the range of 1-5 inclusive
     * @return the average of rating0, rating1, and rating2 as a double
     */
    public static double averageRating(int rating0, int rating1, int rating2){
        return (rating0 + rating1 + rating2) / 3.0;
    }


    /**
     * Computes the number of stars for a given rating to the nearest half star. This is
     * equivalent to rounding the input to the nearest 0.5. For example, a something with
     * a rating of 3.34 would have a star rating of 3.5 stars.
     *
     * @param rating An average rating as a double in the range of 1.0-5.0 inclusive
     * @return The star rating of the input rating
     */
    public static double starRating(double rating){
        return Math.round(rating * 2.0) / 2.0;
    }


    /**
     * Updates an average rating after a new rating is made.
     *
     * @param average         The current average rating
     * @param numberOfRatings The number of ratings contributing to the current average rating
     * @param newRatingValue  The value of the new rating as a double in the range of 1.0-5.0 inclusive
     * @return The new average rating after the new rating has been applied
     */
    public static double updateAverage(double average, int numberOfRatings, double newRatingValue){
        return (average * numberOfRatings + newRatingValue) / (numberOfRatings + 1);
    }


    /**
     * Computes the Bayesian average for the given inputs. The Bayesian average is computed
     * by adding a fixed number of extra ratings at a certain value to the current rating.
     *
     * Background: Sorting rated items by their Bayesian average can improve the usefulness of
     * their rankings. For example, an item with 1 rating of 5 with no other ratings will
     * be ranked higher than an item with 200 ratings at an average rating of 4.9. Most
     * likely we would prefer the later item. To address this we can rank the items by their
     * Bayesian rating and choose 5 extra ratings of 3 to be added to each item. Now the
     * first item has 1 rating of 5 and 5 ratings of 3 for a Bayesian average of 3.33 and the
     * second item has 200 ratings at an average of 4.9 and 5 ratings of 3 for a Bayesian
     * average of 4.85. Bayesian averages can be used in this way to lower ratings where
     * there is not enough information to make a judgment on the item.
     *
     * Hint: You can call your updateAverage method in a loop to complete this method
     *
     * @param average              The current average rating
     * @param numberOfRatings      The number of ratings contributing to the current average rating
     * @param numberOfExtraRatings The number of extra ratings to be added to the current average
     * @param extraRatingValue     The value of the extra ratings
     * @return The new average after the extra ratings have been taken into account
     */
    public static double bayesianAverage(double average, int numberOfRatings,
                                  int numberOfExtraRatings, double extraRatingValue){

        int totalRatings = numberOfRatings;
        double rating = average;
        for(int i = 0; i < numberOfExtraRatings; i++){
            rating = updateAverage(rating, totalRatings, extraRatingValue);
            totalRatings++;
        }

        return rating;
    }

}
