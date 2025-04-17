public class Practice {
    public static void main(String[] args) {
        int number = 0b11010010110011100100101011;
        number = number >> 16;
        int mask = 0xff;
        int result = number & mask;
        System.out.println(Integer.toBinaryString(result));
    }
}