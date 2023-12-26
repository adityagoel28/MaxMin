package MaxMin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Max Min program!");

        System.out.println("Integer Max");
        System.out.println("Maximum of 3, 4, 5: " + Max_Min.findMax(3, 4, 5)); // tc 1.1
        System.out.println("Maximum of 5, 4, 3: " + Max_Min.findMax(5, 4, 3)); // tc 1.2
        System.out.println("Maximum of 4, 5, 3: " + Max_Min.findMax(4, 5, 3)); // tc 1.3

        System.out.println("Double Max");
        System.out.println("Maximum of 1.3, 2.4, 3.5: " + Max_Min.findMax(1.3, 2.4, 3.5)); // tc 2.1
        System.out.println("Maximum of 3.5, 1.3, 2.4: " + Max_Min.findMax(3.5, 1.3, 2.4)); // tc 2.2
        System.out.println("Maximum of 1.3, 3.5, 2.4: " + Max_Min.findMax(1.3, 3.5, 2.4)); // tc 2.3

        System.out.println("String Max");
        System.out.println("Maximum of Apple, Banana, Peach: " + Max_Min.findMax("Apple", "Banana", "Peach")); // tc 3.1
        System.out.println("Maximum of Peach, Apple, Banana: " + Max_Min.findMax("Peach","Apple", "Banana")); // tc 3.2
        System.out.println("Maximum of Apple, Peach, Banana: " + Max_Min.findMax("Apple", "Peach", "Banana")); // tc 3.3
    }
}
