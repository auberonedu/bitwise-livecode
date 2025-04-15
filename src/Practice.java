public class Practice {
    public static void main(String[] args) {
        int number = 0b110100101100111001011011;
        int red = number >> 16;
        int green = number >> 8;
        int mask = 0xff;
        int result = number & mask;

        System.out.println("Red   -- " + Integer.toBinaryString((red & mask)) + " - " + (red & mask));
        System.out.println("Green -- " + Integer.toBinaryString((green & mask)) + " - " + (green & mask));
        System.out.println("Blue  -- " + Integer.toBinaryString(result) + " - " + (result));
    }
}