public class Practice {
    public static void main(String[] args) {
        int num = 0xff;
        System.out.println(Integer.toBinaryString(num));

        int number = 0b110100101100111001011011;
        //           11010010 11001110 01011011
        number = number >> 8; // shift 8 bits over right for G, 16 for R
        int mask = 0x000000ff; // for B
        //         0x 00 00 00 ff
        int result = number & mask;
        System.out.println(Integer.toBinaryString(result));
        // int result = num2 & mask;
        // System.out.println(Integer.toBinaryString(result));
    }
}