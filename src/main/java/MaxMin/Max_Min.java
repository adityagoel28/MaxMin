package MaxMin;

import java.util.Arrays;

public class Max_Min {
    public static <T extends Comparable<T>> T findMax(T... elements) {
        if (elements == null || elements.length == 0) {
            return null;
        }

        Arrays.sort(elements);
        return elements[elements.length - 1]; // The last element is the largest after sorting
    }
}