public class Practice {
    public static void main(String[] args) {
        int number = 0b110110101001101011011;
        number = number >> 16;
        System.out.println(Integer.toBinaryString(number));
        int mask = 0xff;
        int result = number & mask;
        System.out.println(Integer.toBinaryString(result));
    }
}