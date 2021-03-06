
import java.util.Comparator;
/**
 * This class is used to sort the linked list of entries in the SimpleHashMap
 * It extends comparable and implements the comparator interface to compare
 * entries by value then by key in order to sort them by alphabet
 *
 * <p>Bugs: none known
 *
 * @author sobin
 */
public class CompareValueThenKey<String extends Comparable<String>,
Integer extends Comparable<Integer>>
implements Comparator<SimpleHashMap.Entry<String, Integer>> {
 
    /**
     * This method dictates how Collections.sort will arrange the sorted
     * values.  First by value then sort the highest values in alphabetical 
     * order
     * 
     * @param a first entry to be compared
     * @param b second entry to be compared to the first
     * @return the compareTo int value to determine higher values and 
     * alphabetical order
     */
    @Override
    public int compare(SimpleHashMap.Entry<String, Integer> a, 
            SimpleHashMap.Entry<String, Integer> b) {
        //save int value of compareTo method to determine ordering in list 
        int cmp1 = b.getValue().compareTo(a.getValue());
        //if values are not return int value to determine value ordering
        if (cmp1 != 0) {
            return cmp1;
        } else {
            //return int value for ordering alphabetically
            return a.getKey().compareTo(b.getKey());
        }
    }
 
}
