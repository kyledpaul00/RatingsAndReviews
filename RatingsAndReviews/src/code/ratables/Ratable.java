package code.ratables;

import java.util.ArrayList;

import code.Review;

public abstract class Ratable{

protected ArrayList<Review> ratables;
protected String id;

public Ratable() {
	ratables = new ArrayList<Review>();
	
}

    // provided since it's required by the example AlphabeticalComparator class
    public abstract String getDescription();
    
    public abstract String getLink();
    
    public String getID() {
    		return id;
    }
    public ArrayList<Review> getReviews(){
    		return ratables;
    }
    public void addRating(int rating) {
    		ratables.add(new Review(rating));
    }
    public void addRatingWithReview(int rating, String review) {
    		ratables.add(new Review(rating, review));
    }
    

    // After you implement the required methods you uncomment the toString method for more descriptive output

 @Override
    public String toString(){
        return "(" + this.getLink() + ") " + this.getDescription() + " | ratings: " + this.getReviews();
    }

}
