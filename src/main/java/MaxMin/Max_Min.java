package MaxMin;

public class Max_Min {
    public static Integer findMax(Integer x, Integer y, Integer z) {
        Integer max = x; // Assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is larger
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is larger
        }

        return max;
    }

    public static Double findMax(Double x, Double y, Double z) {
        Double max = x; // Assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is larger
        }

        if (z.compareTo(max) > 0) {
            max = z; // z is larger
        }

        return max;
    }
}