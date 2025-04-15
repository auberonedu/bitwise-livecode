public class Practice {
    public static void main(String[] args) {
        int number = 0b110100100101001011101011; 
        int green = number >> 8; // get green - shift over 8 times to the right, where the last 8 digits of number will be shifted off.
        int red = number >> 16; // get red
        int mask = 0x000000ff; 
        int result = number & mask; 
        System.out.println(Integer.toBinaryString(result));
        System.out.println(Integer.toBinaryString(number));
        System.out.println(mask);
    }
}

/**
 * 
 * 0x (a)00 R(00) G(00) B(FF)
 * 
 * 0xf = 4 bits
 * 0xff = 8 bits
 * 
 * 
 */