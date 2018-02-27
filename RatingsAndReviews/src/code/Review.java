package code;

/**
 * Used to store a ratings and text review in a single instance
 */
public class Review{

    private int rating;
    private String review;

    /**
     * If only a rating is provided, set the review to the empty String
     *
     * @param rating An integer rating in the range 1-5
     */
    public Review(int rating){
        this(rating, "");
    }

    public Review(int rating, String review){
        this.rating = rating;
        this.review = review;
    }

    public int getRating(){
        return this.rating;
    }

    public String getReview(){
        return this.review;
    }

    @Override
    public String toString(){
        if(this.review.equals("")){
            return "" + this.rating;
        }else{
            return "(" + this.rating + ", " + this.review + ")";
        }
    }
}
