public class Practice {
    public static void main(String[] args) {
        // Starting with "0b" means that you are typing the number in binary
        // int number = 0b1110;
        // Starting with "0x" means that you are typing the number in hexadecimal
        // int number = 0b00011111; // 0x1f; = 31
        // System.out.println(Integer.toBinaryString(number));
        int number = 0b110100101100111001011011;
        number = number >> 8; // Shift over 8 times
        System.out.println(Integer.toBinaryString(number));
        // int mask = 0b00001111; // same as 0b1111 and 0x0f and 0xf
        int mask = 0xff;
        int result = number & mask;
        System.out.println(Integer.toBinaryString(result));
    }
}