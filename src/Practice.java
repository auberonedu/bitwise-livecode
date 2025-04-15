public class Practice {
    public static void main(String[] args) {
        // Starting with 0b means we are typing the number as binary
        // So 0b111 means 0b(binary) + 111 -> 7
        // 0x means hexadecimal + f -> 15
        int hexnumber = 0x1f;
        int number =    0b110100101100111001011011;
        // Erasing the last 8 numbers
        number = number >> 8;
        System.out.println(Integer.toBinaryString(number));
        //Finding the last 8 numbers in a bit
        int mask =      0xff;
        int result = number & mask;
        System.out.println(number);
        System.out.println(Integer.toBinaryString(result));
    }
}