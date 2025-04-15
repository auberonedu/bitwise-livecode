public class Practice {
    public static void main(String[] args) {
        int number = 0b110100101100111001011011;
        number = number >> 16;
        int mask = 0x0ff;
        int result = number & mask;
        System.out.println(Integer.toBinaryString(result));
    }
}