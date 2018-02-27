	package code.comparators;

import java.util.Comparator;

import code.Utilities;
import code.ratables.Ratable;

public class AverageRatingComparator implements Comparator<Ratable>{ 


	@Override
	public int compare(Ratable o1, Ratable o2) {
		// TODO Auto-generated method stub
		if(Utilities.averageRatingOfReviews(o1.getReviews())> Utilities.averageRatingOfReviews(o2.getReviews())) {
			return -1;
		}
		if(Utilities.averageRatingOfReviews(o1.getReviews())< Utilities.averageRatingOfReviews(o2.getReviews())) {
			return 1;
		}
		
		return 0;
	}

}
