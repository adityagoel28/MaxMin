package MaxMin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Max Min program!");

        System.out.println("Integer Max");
        System.out.println("Maximum of 3, 4, 5: " + Max_Min.findMax(3, 4, 5)); // tc 1.1
        System.out.println("Maximum of 5, 4, 3: " + Max_Min.findMax(5, 4, 3)); // tc 1.2
        System.out.println("Maximum of 4, 5, 3: " + Max_Min.findMax(4, 5, 3)); // tc 1.3
    }
}
