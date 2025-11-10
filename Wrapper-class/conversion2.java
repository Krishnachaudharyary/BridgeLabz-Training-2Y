public class DoubleConversion {
    public static void main(String[] args) {
        // Given Double object
        Double obj = 45.67;

        // Convert to primitive double
        double d = obj.doubleValue();

        // Convert to int using casting
        int i = (int) d;

        // Display values
        System.out.println("Double object value: " + obj);
        System.out.println("Primitive double value: " + d);
        System.out.println("Converted int value (after casting): " + i);
    }
}
