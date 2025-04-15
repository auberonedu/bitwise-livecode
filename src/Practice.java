public class Practice {
    public static void main(String[] args) {
        int number = 0b110011100101101101011011;
        number = number >> 8;
        int mask = 0xff;
        int result = number & mask;
        System.out.println(Integer.toBinaryString(result));
    }
}