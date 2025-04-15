public class Practice {
    public static void main(String[] args) {
        // 0b represent binary
        //0x represents hexadecimal
        int number = 0b01000110010; // 0x1f

        number = number >> 8;

        int mask = 0xff;

        int result = number & mask;

        // System.out.println(number);

        System.out.println(Integer.toBinaryString(result));

        // System.out.println(Integer.toBinaryString(number));

        // System.out.println("Yay bitwise operations!");

        
    }
}