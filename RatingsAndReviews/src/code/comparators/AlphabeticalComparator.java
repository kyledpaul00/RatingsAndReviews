package code.comparators;

import code.ratables.Ratable;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<Ratable>{

    /**
     * The compare method is inherited from the Comparator interface and defines how two Ratables will be compared.
     * When used in conjunction with Collections.sort a collection (ArrayList for our purposes) of Ratables will
     * be sorted according to this compare method as follows:
     *
     * -if compare(o1, o2) returns a negative int, o1 will be placed before o2
     * -if compare(o1, o2) returns a positive int, o2 will be placed before o1
     * -if compare(o1, o2) returns 0, o1 and o2 may be placed in either order relative to each other
     *
     * This Comparator uses compareToIgnoreCase to compare the description of the Ratables which returns an int
     * following the 3 cases above to compare Strings alphabetically.
     *
     * @param o1 The first Ratable to be compared
     * @param o2 The second Ratable to be compared
     * @return A negative int, zero, or a positive int if the first Ratable comes before, the same, or after the
     *         second respectively
     */
    @Override
    public int compare(Ratable o1, Ratable o2){
        return o1.getDescription().compareToIgnoreCase(o2.getDescription());
    }

}
