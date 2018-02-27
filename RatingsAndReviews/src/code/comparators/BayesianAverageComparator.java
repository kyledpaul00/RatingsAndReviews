package code.comparators;

import java.util.Comparator;

import code.Utilities;
import code.ratables.Ratable;

public class BayesianAverageComparator implements Comparator<Ratable> {

	private int numberOfExtraRatings;
	private double extraRatingValue;
	
	public BayesianAverageComparator(int n, double b) {
		numberOfExtraRatings = n;
		extraRatingValue = b;
	}

	@Override
	public int compare(Ratable o1, Ratable o2) {
		// TODO Auto-generated method stub
		if(Utilities.bayesianAverageOfReviews(o1.getReviews(), numberOfExtraRatings, extraRatingValue)>Utilities.bayesianAverageOfReviews(o2.getReviews(), numberOfExtraRatings, extraRatingValue)) {
			return -1;
		}
		if(Utilities.bayesianAverageOfReviews(o1.getReviews(), numberOfExtraRatings, extraRatingValue)<Utilities.bayesianAverageOfReviews(o2.getReviews(), numberOfExtraRatings, extraRatingValue)) {
			return 1;
		}
		return 0;
	}

}
