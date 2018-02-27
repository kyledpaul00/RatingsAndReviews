package code.comparators;

import java.util.Comparator;

import code.ratables.Ratable;

public class NumberOfReviewsComparator implements Comparator<Ratable> {


	@Override
	public int compare(Ratable o1, Ratable o2) {
		// TODO Auto-generated method stub
		
		if(o1.getReviews().size() > o2.getReviews().size()) {
			return -1;
		}
		if(o1.getReviews().size() < o2.getReviews().size()) {
			return 1;
		}
		
		return 0;
	}

}
