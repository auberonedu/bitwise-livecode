public class Practice {
    public static void main(String[] args) {
        int number = 0b110100101100111001011011;
        number = number >> 8;
        System.out.println(Integer.toBinaryString(number));
        int mask = 0xff;
        int result = number & mask;
        System.out.println(Integer.toBinaryString(result));
    }
}