public class Practice {
    public static void main(String[] args) {
        int number = 0b000011110110101101011011;
        number = number >> 16;
        int mask = 0xff;
        int result = number & mask;
        System.out.println(Integer.toBinaryString(result));
    }
}